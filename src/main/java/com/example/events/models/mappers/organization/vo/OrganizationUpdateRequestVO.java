package com.example.events.models.mappers.organization.vo;

import lombok.Data;

@Data
public class OrganizationUpdateRequestVO {
    private long id;
    private String name;
    private String abbr;
    private String description;
}
