package br.com.deisesales.events.service;

import br.com.deisesales.events.dto.EmailRequestDTO;

public interface EmailServiceClient {

    public void sendEmail(EmailRequestDTO dto);

}
