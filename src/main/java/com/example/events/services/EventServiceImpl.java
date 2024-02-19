package com.example.events.services;

import com.example.events.models.dao.entities.Event;
import com.example.events.models.dao.repositories.EventRepository;
import com.example.events.models.dto.EventDto;
import com.example.events.models.mappers.event.EventMapper;
import com.example.events.models.mappers.event.EventVOMapper;
import com.example.events.services.interfaces.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private EventMapper eventMapper;

    @Override
    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    @Override
    public Event getById(long id) {
        return eventRepository.getReferenceById(id);
    }

    @Override
    public Event create(EventDto eventDto) {
        Event event = eventMapper.eventDtoToEvent(eventDto);
        return eventRepository.save(event);
    }

    @Override
    public Event update(EventDto eventDto) {
        Event event = eventMapper.eventDtoToEvent(eventDto);
        return eventRepository.save(event);
    }

    @Override
    public Event softDelete(long id) {
        return new Event();
    }
}
