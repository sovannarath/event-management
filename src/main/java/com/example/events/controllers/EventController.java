package com.example.events.controllers;

import com.example.events.models.dto.EventDto;
import com.example.events.models.mappers.event.EventVOMapper;
import com.example.events.models.mappers.event.vo.EventCreateRequestVO;
import com.example.events.models.mappers.event.vo.EventCreateResponseVO;
import com.example.events.models.mappers.event.vo.EventResponseVO;
import com.example.events.models.mappers.event.vo.EventUpdateRequestVO;
import com.example.events.services.interfaces.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EventController {

    @Autowired
    private EventService eventService;
    @Autowired
    private EventVOMapper eventVOMapper;

    @GetMapping("/events")
    public List<EventResponseVO> getAll() {
        return eventVOMapper.toListEventResponseVO(eventService.getAll());
    }

    @PostMapping("/events")
    public EventCreateResponseVO create(@RequestBody EventCreateRequestVO eventCreateRequestVO) {
        EventDto eventDto = eventVOMapper.fromEventCreateRequestVO(eventCreateRequestVO);
        return eventVOMapper.toEventCreateResponseVO(eventService.create(eventDto));
    }

    @GetMapping("/events/{id}")
    public EventResponseVO getById(@PathVariable("id") long id) {
        return eventVOMapper.toEventResponseVO(eventService.getById(id));
    }

    @PutMapping("/events")
    public EventResponseVO update(@RequestBody EventUpdateRequestVO eventUpdateRequestVO) {
        EventDto eventDto = eventVOMapper.fromEventUpdateRequestVO(eventUpdateRequestVO);
        return eventVOMapper.toEventResponseVO(eventService.update(eventDto));
    }

    @DeleteMapping("/events/{id}")
    public EventResponseVO delete(@PathVariable long id) {
        return eventVOMapper.toEventResponseVO(eventService.softDelete(id));
    }

}
