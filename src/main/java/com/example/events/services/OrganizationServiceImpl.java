package com.example.events.services;

import com.example.events.models.dao.entities.Organization;
import com.example.events.models.dao.repositories.OrganizationRepository;
import com.example.events.models.dto.OrganizationDto;
import com.example.events.models.mappers.organization.OrganizationMapper;
import com.example.events.services.interfaces.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;
    @Autowired
    private OrganizationMapper organizationMapper;

    @Override
    public List<Organization> getAll() {
        return organizationRepository.findAll();
    }

    @Override
    public Organization getById(long id) {
        return organizationRepository.getReferenceById(id);
    }

    @Override
    public Organization create(OrganizationDto organizationDto) {
        Organization organization = organizationMapper.organizationDtoToOrganization(organizationDto);
        return organizationRepository.save(organization);
    }

    @Override
    public Organization update(OrganizationDto organizationDto) {
        Organization organization = organizationMapper.organizationDtoToOrganization(organizationDto);
        return organizationRepository.save(organization);
    }

    @Override
    public Organization softDelete(long id) {
        return new Organization();
    }
}
