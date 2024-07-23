package br.com.deisesales.events.controller;

import br.com.deisesales.events.entity.Event;
import br.com.deisesales.events.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/eventos")
@RequiredArgsConstructor
public class EventController {

    private final EventService service;

    @PostMapping
    public Event createEvent() {
        // service.createEvent;
        return null;
    }

    @GetMapping
    public List<Event> getAllEvents() {
        // service.getAllEvents;
        return null;
    }

    @GetMapping("/upcoming")
    public List<Event> getUpcommingEvents() {
        // service.getUpcommingEvents;
        return null;
    }

    @PostMapping("/{eventId}/register")
    public ResponseEntity<String> registerParticipant(String eventId) {
        return null;
    }
}
