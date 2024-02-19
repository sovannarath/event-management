package com.example.events.models.mappers.role;

import com.example.events.models.dao.entities.Role;
import com.example.events.models.dto.RoleDto;
import com.example.events.models.mappers.role.vo.RoleCreateRequestV0;
import com.example.events.models.mappers.role.vo.RoleCreateResponseVO;
import com.example.events.models.mappers.role.vo.RoleResponseVO;
import com.example.events.models.mappers.role.vo.RoleUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleVOMapper {

    RoleVOMapper INSTANCE = Mappers.getMapper(RoleVOMapper.class);

    RoleDto fromRoleCreateRequestVO(RoleCreateRequestV0 roleCreateRequestV0);
    RoleDto fromRoleUpdateRequestVO(RoleUpdateRequestVO roleUpdateRequestVO);
    RoleCreateResponseVO toRoleCreateResponseVO(Role role);
    RoleResponseVO toRoleResponseVO(Role role);
    List<RoleResponseVO> toListRoleResponseVO(List<Role> roles);

}
