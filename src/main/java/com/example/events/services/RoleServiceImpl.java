package com.example.events.services;

import com.example.events.models.dao.entities.Role;
import com.example.events.models.dao.repositories.RoleRepository;
import com.example.events.models.dto.RoleDto;
import com.example.events.models.mappers.role.RoleMapper;
import com.example.events.services.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role getById(long id) {
        return roleRepository.getReferenceById(id);
    }

    @Override
    public Role create(RoleDto roleDto) {
        Role role = roleMapper.roleDtoToRole(roleDto);
        return roleRepository.save(role);
    }

    @Override
    public Role update(RoleDto roleDto) {
        Role role = roleMapper.roleDtoToRole(roleDto);
        return roleRepository.save(role);
    }

    @Override
    public Role softDelete(long id) {
        roleRepository.deleteById(id);
        return new Role();
    }
}
