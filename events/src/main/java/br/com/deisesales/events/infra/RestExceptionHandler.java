package br.com.deisesales.events.infra;

import br.com.deisesales.events.exceptions.EventFullException;
import br.com.deisesales.events.exceptions.EventNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EventNotFoundException.class)
    private ResponseEntity<RestErrorMessage> eventNotFoundHandler(EventNotFoundException exception) {
        RestErrorMessage restErrorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(restErrorMessage);
    }

    @ExceptionHandler(EventFullException.class)
    private ResponseEntity<RestErrorMessage> eventFullErrorHandler(EventFullException exception) {
        RestErrorMessage restErrorMessage = new RestErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(restErrorMessage);
    }
}
