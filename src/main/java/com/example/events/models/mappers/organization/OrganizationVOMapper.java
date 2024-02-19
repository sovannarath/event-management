package com.example.events.models.mappers.organization;

import com.example.events.models.dao.entities.Organization;
import com.example.events.models.dto.OrganizationDto;
import com.example.events.models.mappers.organization.vo.OrganizationCreateRequestVO;
import com.example.events.models.mappers.organization.vo.OrganizationCreateResponseVO;
import com.example.events.models.mappers.organization.vo.OrganizationResponseVO;
import com.example.events.models.mappers.organization.vo.OrganizationUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrganizationVOMapper {

    OrganizationVOMapper INSTANCE = Mappers.getMapper(OrganizationVOMapper.class);

    OrganizationDto fromOrganizationCreateRequestVO(OrganizationCreateRequestVO organizationCreateRequestVO);
    OrganizationDto fromOrganizationUpdateRequestVO(OrganizationUpdateRequestVO organizationUpdateRequestVO);
    OrganizationCreateResponseVO toOrganizationCreateResponseVO(Organization organization);
    OrganizationResponseVO toOrganizationResponseVO(Organization organization);
    List<OrganizationResponseVO> toListOrganizationResponseVO(List<Organization> organization);

}
