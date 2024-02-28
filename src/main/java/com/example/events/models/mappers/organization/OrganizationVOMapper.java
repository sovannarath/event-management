package com.example.events.models.mappers.organization;

import com.example.events.models.dao.entities.Organization;
import com.example.events.models.dto.OrganizationDto;
import com.example.events.models.mappers.organization.vo.OrganizationCreateRequestVO;
import com.example.events.models.mappers.organization.vo.OrganizationCreateResponseVO;
import com.example.events.models.mappers.organization.vo.OrganizationResponseVO;
import com.example.events.models.mappers.organization.vo.OrganizationUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrganizationVOMapper {

    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    OrganizationDto fromOrganizationCreateRequestVO(OrganizationCreateRequestVO organizationCreateRequestVO);
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    OrganizationDto fromOrganizationUpdateRequestVO(OrganizationUpdateRequestVO organizationUpdateRequestVO);
    OrganizationCreateResponseVO toOrganizationCreateResponseVO(Organization organization);
    OrganizationResponseVO toOrganizationResponseVO(Organization organization);
    List<OrganizationResponseVO> toListOrganizationResponseVO(List<Organization> organization);

}
