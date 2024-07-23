package br.com.deisesales.events.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class EmailRequestDTO {

    private String participantEmail;
    private String subject;
    private String body;
}
