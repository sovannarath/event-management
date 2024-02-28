package com.example.events.models.mappers.organization;

import com.example.events.models.dao.entities.Organization;
import com.example.events.models.dao.entities.User;
import com.example.events.models.dto.OrganizationDto;
import com.example.events.models.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OrganizationMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    OrganizationDto organizationToOrganizationDto(Organization organization);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    Organization organizationDtoToOrganization(OrganizationDto organizationDto);

}
