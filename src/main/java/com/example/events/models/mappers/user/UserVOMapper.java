package com.example.events.models.mappers.user;

import com.example.events.models.dao.entities.User;
import com.example.events.models.dto.UserDto;
import com.example.events.models.mappers.user.vo.UserCreateResponseVO;
import com.example.events.models.mappers.user.vo.UserCreateRequestVO;
import com.example.events.models.mappers.user.vo.UserResponseVO;
import com.example.events.models.mappers.user.vo.UserUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserVOMapper {

    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    UserDto fromUserCreateRequestVO(UserCreateRequestVO userCreateVO);
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    UserDto fromUserUpdateRequestVO(UserUpdateRequestVO userUpdateRequestVO);
    UserCreateResponseVO toUserCreateResponseVO(User user);
    UserResponseVO toUserResponseVO(User user);
    List<UserResponseVO> toListUserResponseVO(List<User> users);

}
