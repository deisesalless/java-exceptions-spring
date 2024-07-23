package br.com.deisesales.events.controller;

import br.com.deisesales.events.entity.Event;
import br.com.deisesales.events.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/eventos")
@RequiredArgsConstructor
public class EventController {

    private final EventService service;

    public Event createEvent() {
        // service.createEvent;
        return null;
    }

    public List<Event> getAllEvents() {
        // service.getAllEvents;
        return null;
    }

    public List<Event> getUpCommingEvents() {
        // service.getUpCommingEvents;
        return null;
    }

    public ResponseEntity<String> registerParticipant(String eventId) {
        return null;
    }
}
