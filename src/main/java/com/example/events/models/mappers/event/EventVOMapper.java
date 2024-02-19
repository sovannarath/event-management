package com.example.events.models.mappers.event;

import com.example.events.models.dao.entities.Event;
import com.example.events.models.dto.EventDto;
import com.example.events.models.mappers.event.vo.EventCreateRequestVO;
import com.example.events.models.mappers.event.vo.EventCreateResponseVO;
import com.example.events.models.mappers.event.vo.EventResponseVO;
import com.example.events.models.mappers.event.vo.EventUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventVOMapper {

    EventVOMapper INSTANCE = Mappers.getMapper(EventVOMapper.class);

    EventDto fromEventCreateRequestVO(EventCreateRequestVO eventCreateRequestVO);
    EventDto fromEventUpdateRequestVO(EventUpdateRequestVO eventUpdateRequestVO);
    EventCreateResponseVO toEventCreateResponseVO(Event event);
    EventResponseVO toEventResponseVO(Event event);
    List<EventResponseVO> toListEventResponseVO(List<Event> event);

}
