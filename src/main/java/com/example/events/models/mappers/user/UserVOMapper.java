package com.example.events.models.mappers.user;

import com.example.events.models.dao.entities.User;
import com.example.events.models.dto.UserDto;
import com.example.events.models.mappers.user.vo.UserCreateResponseVO;
import com.example.events.models.mappers.user.vo.UserCreateRequestVO;
import com.example.events.models.mappers.user.vo.UserResponseVO;
import com.example.events.models.mappers.user.vo.UserUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserVOMapper {

    UserVOMapper INSTANCE = Mappers.getMapper(UserVOMapper.class);

    UserDto fromUserCreateRequestVO(UserCreateRequestVO userCreateVO);
    UserDto fromUserUpdateRequestVO(UserUpdateRequestVO userUpdateRequestVO);
    UserCreateResponseVO toUserCreateResponseVO(User user);
    UserResponseVO toUserResponseVO(User user);
    List<UserResponseVO> toListUserResponseVO(List<User> users);


}
