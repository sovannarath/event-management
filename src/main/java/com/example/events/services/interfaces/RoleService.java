package com.example.events.services.interfaces;

import com.example.events.models.dao.entities.Role;
import com.example.events.models.dto.RoleDto;

import java.util.List;

public interface RoleService {
    List<Role> getAll();
    Role getById(long id);
    Role create(RoleDto roleDto);
    Role update(RoleDto roleDto);
    Role softDelete(long id);
}
