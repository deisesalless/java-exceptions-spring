package br.com.deisesales.events.repository;

import br.com.deisesales.events.entity.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@Slf4j
public class EventRepository {

    public Event save(Event event) {
        return null;
    }

    public List<Event> findAll() {
        return null;
    }

    public Event findById(String id) {
        return null;
    }

    public List<Event> UpcommingEvents(LocalDateTime time) {
        return null;
    }
}
