package br.com.deisesales.events.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Event {

    private Integer registeredParticipants;
    private Integer maxParticipants;
}
