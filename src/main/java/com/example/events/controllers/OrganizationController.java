package com.example.events.controllers;

import com.example.events.models.dto.OrganizationDto;
import com.example.events.models.dto.RoleDto;
import com.example.events.models.mappers.organization.OrganizationMapper;
import com.example.events.models.mappers.organization.OrganizationVOMapper;
import com.example.events.models.mappers.organization.vo.OrganizationCreateRequestVO;
import com.example.events.models.mappers.organization.vo.OrganizationCreateResponseVO;
import com.example.events.models.mappers.organization.vo.OrganizationResponseVO;
import com.example.events.models.mappers.role.vo.RoleCreateRequestV0;
import com.example.events.models.mappers.role.vo.RoleCreateResponseVO;
import com.example.events.models.mappers.role.vo.RoleResponseVO;
import com.example.events.models.mappers.role.vo.RoleUpdateRequestVO;
import com.example.events.services.interfaces.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;
    @Autowired
    private OrganizationMapper organizationMapper;
    @Autowired
    private OrganizationVOMapper organizationVOMapper;

    @PostMapping("/organizations")
    public OrganizationCreateResponseVO create(@RequestBody OrganizationCreateRequestVO orgRequest) {
        OrganizationDto organizationDto = organizationVOMapper.fromOrganizationCreateRequestVO(orgRequest);
        return organizationVOMapper.toOrganizationCreateResponseVO(organizationService.create(organizationDto));
    }

    @GetMapping("/organizations")
    public List<OrganizationResponseVO> getAll() {
        return organizationVOMapper.toListOrganizationResponseVO(organizationService.getAll());
    }

    @PostMapping("/organizations")
    public OrganizationResponseVO update(@RequestBody OrganizationCreateRequestVO orgRequest) {
        OrganizationDto organizationDto = organizationVOMapper.fromOrganizationCreateRequestVO(orgRequest);
        return organizationVOMapper.toOrganizationResponseVO(organizationService.update(organizationDto));
    }

    @GetMapping("/organizations/{id}")
    public OrganizationResponseVO getById(@PathVariable("id") long id) {
        return organizationVOMapper.toOrganizationResponseVO(organizationService.getById(id));
    }

    @DeleteMapping("/organizations/{id}")
    public OrganizationResponseVO delete(@PathVariable("id") long id) {
        return organizationVOMapper.toOrganizationResponseVO(organizationService.softDelete(id));
    }

}
