package com.example.events.models.mappers.role;

import com.example.events.models.dao.entities.Role;
import com.example.events.models.dto.RoleDto;
import com.example.events.models.mappers.role.vo.RoleCreateRequestV0;
import com.example.events.models.mappers.role.vo.RoleCreateResponseVO;
import com.example.events.models.mappers.role.vo.RoleResponseVO;
import com.example.events.models.mappers.role.vo.RoleUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleVOMapper {

    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    RoleDto fromRoleCreateRequestVO(RoleCreateRequestV0 roleCreateRequestV0);
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    RoleDto fromRoleUpdateRequestVO(RoleUpdateRequestVO roleUpdateRequestVO);
    RoleCreateResponseVO toRoleCreateResponseVO(Role role);
    RoleResponseVO toRoleResponseVO(Role role);
    List<RoleResponseVO> toListRoleResponseVO(List<Role> roles);

}
