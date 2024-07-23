package br.com.deisesales.events.controller;

import br.com.deisesales.events.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
@RequiredArgsConstructor
public class EventController {

    private final EventService service;
}
