package br.com.deisesales.events.controller;

import br.com.deisesales.events.dto.EventRequestDTO;
import br.com.deisesales.events.dto.SubscriptionRequestDTO;
import br.com.deisesales.events.entity.Event;
import br.com.deisesales.events.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventos")
@RequiredArgsConstructor
public class EventController {

    private final EventService service;

    @PostMapping
    public Event createEvent(@RequestBody EventRequestDTO dto) {
         service.createEvent(dto);
        return null;
    }

    @GetMapping
    public List<Event> getAllEvents() {
         service.getAllEvents();
        return null;
    }

    @GetMapping("/upcoming")
    public List<Event> getUpcommingEvents() {
         service.getUpcommingEvents();
        return null;
    }

    @PostMapping("/{eventId}/register")
    public ResponseEntity<String> registerParticipant(@PathVariable String eventId, @RequestBody SubscriptionRequestDTO dto) {
        return null;
    }
}
