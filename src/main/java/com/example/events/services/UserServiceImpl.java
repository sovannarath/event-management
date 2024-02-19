package com.example.events.services;

import com.example.events.models.mappers.user.UserMapper;
import com.example.events.models.dao.entities.User;
import com.example.events.models.dto.UserDto;
import com.example.events.models.dao.repositories.UserRepository;
import com.example.events.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(long id) {
        return userRepository.getReferenceById(id);
    }

    @Override
    public User create(UserDto userDto) {
        User user = userMapper.userDtoToUser(userDto);
        userRepository.save(user);
        return user;
    }

    @Override
    public User update(UserDto userDto) {
        User user = userMapper.userDtoToUser(userDto);
        userRepository.save(user);
        return user;
    }

    @Override
    public User softDelete(long id) {
        userRepository.deleteById(id);
        return new User();
    }

}
