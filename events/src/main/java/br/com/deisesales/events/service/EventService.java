package br.com.deisesales.events.service;

import br.com.deisesales.events.dto.EmailRequestDTO;
import br.com.deisesales.events.dto.EventRequestDTO;
import br.com.deisesales.events.entity.Event;
import br.com.deisesales.events.entity.Subscription;
import br.com.deisesales.events.exceptions.EventFullException;
import br.com.deisesales.events.exceptions.EventNotFoundException;
import br.com.deisesales.events.repository.EventRepository;
import br.com.deisesales.events.repository.SubscriptionRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class EventService {

    private final EventRepository repository;
    private final EmailServiceClient emailServiceClient;
    private final SubscriptionRepository subscriptionRepository;

    public Event createEvent(EventRequestDTO dto) {
        Event newEvent = new Event(dto);
        repository.save(newEvent);
        return null;
    }

    public List<Event> getAllEvents() {
        return repository.findAll();
    }

    public List<Event> getUpcommingEvents() {
        return repository.getUpcommingEvents(LocalDateTime.now());
    }

    private Boolean isEventFull(Event event) {
        return event.getRegisteredParticipants() >= event.getMaxParticipants();
    }

    public void registerParticipant(String eventId, String participantEmail) {
        Event event = repository.findById(eventId); //.orElseThrow(EventNotFoundException::new);

        if (isEventFull(event)) {
            throw new EventFullException();
        }

        Subscription subscription = new Subscription(event, participantEmail);
        subscriptionRepository.save(subscription);

        event.setRegisteredParticipants(event.getRegisteredParticipants() + 1);

        EmailRequestDTO emailRequest = new EmailRequestDTO(participantEmail, "Confirmação da inscrição", "Você está inscrito");

        emailServiceClient.sendEmail(emailRequest);
    }
}
