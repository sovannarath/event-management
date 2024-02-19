package com.example.events.services.interfaces;

import com.example.events.models.dao.entities.User;
import com.example.events.models.dto.UserDto;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(long id);
    User create(UserDto userDto);
    User update(UserDto userDto);
    User softDelete(long id);
}
