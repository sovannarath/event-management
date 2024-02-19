package com.example.events.models.mappers.organization.vo;

import lombok.Data;

@Data
public class OrganizationCreateRequestVO {
    private String name;
    private String abbr;
    private String description;
}
