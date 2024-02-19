package com.example.events.models.mappers.event;

import com.example.events.models.dao.entities.Event;
import com.example.events.models.dto.EventDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EventMapper {

    EventMapper INSTANCE = Mappers.getMapper(EventMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updateAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "id", ignore = true)
    Event eventDtoToEvent(EventDto eventDto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updateAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "id", ignore = true)
    EventDto eventToEventDto(Event event);

}
