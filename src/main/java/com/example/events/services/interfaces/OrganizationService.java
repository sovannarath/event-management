package com.example.events.services.interfaces;

import com.example.events.models.dao.entities.Organization;
import com.example.events.models.dto.OrganizationDto;

import java.util.List;

public interface OrganizationService {
    List<Organization> getAll();
    Organization getById(long id);
    Organization create(OrganizationDto organizationDto);
    Organization update(OrganizationDto organizationDto);
    Organization softDelete(long id);
}
