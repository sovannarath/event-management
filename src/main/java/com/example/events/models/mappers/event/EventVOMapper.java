package com.example.events.models.mappers.event;

import com.example.events.models.dao.entities.Event;
import com.example.events.models.dto.EventDto;
import com.example.events.models.mappers.event.vo.EventCreateRequestVO;
import com.example.events.models.mappers.event.vo.EventCreateResponseVO;
import com.example.events.models.mappers.event.vo.EventResponseVO;
import com.example.events.models.mappers.event.vo.EventUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventVOMapper {

    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    EventDto fromEventCreateRequestVO(EventCreateRequestVO eventCreateRequestVO);
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    EventDto fromEventUpdateRequestVO(EventUpdateRequestVO eventUpdateRequestVO);
    EventCreateResponseVO toEventCreateResponseVO(Event event);
    EventResponseVO toEventResponseVO(Event event);
    List<EventResponseVO> toListEventResponseVO(List<Event> event);

}
