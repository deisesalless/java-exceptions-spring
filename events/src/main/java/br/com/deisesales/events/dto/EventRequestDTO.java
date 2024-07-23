package br.com.deisesales.events.dto;

import lombok.Data;

@Data
public class EventRequestDTO {

    private Integer registeredParticipants;
    private Integer maxParticipants;
}
