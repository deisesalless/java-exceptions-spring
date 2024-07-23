package br.com.deisesales.events.service;

import br.com.deisesales.events.entity.Event;
import br.com.deisesales.events.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class EventService {

    private final EventRepository repository;

    public Event createEvent() {
        // repository.createEvent;
        return null;
    }

    public List<Event> getAllEvents() {
        // repository.getAllEvents;
        return null;
    }

    public List<Event> getUpCommingEvents() {
        // repository.getUpCommingEvents;
        return null;
    }
}
