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

    OrganizationMapper INSTANCE = Mappers.getMapper(OrganizationMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updateAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "id", ignore = true)
    OrganizationDto organizationToOrganizationDto(Organization organization);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updateAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    Organization organizationDtoToOrganization(OrganizationDto organizationDto);

}
