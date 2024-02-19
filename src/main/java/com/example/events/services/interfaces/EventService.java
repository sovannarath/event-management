package com.example.events.services.interfaces;

import com.example.events.models.dao.entities.Event;
import com.example.events.models.dto.EventDto;

import java.util.List;

public interface EventService {
    List<Event> getAll();
    Event getById(long id);
    Event create(EventDto eventDto);
    Event update(EventDto eventDto);
    Event softDelete(long id);
}
