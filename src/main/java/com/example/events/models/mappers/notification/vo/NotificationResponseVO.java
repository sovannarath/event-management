package com.example.events.models.mappers.notification.vo;

import lombok.Data;

@Data
public class NotificationResponseVO {
    private long id;
    private String name;
    private String description;
    private long eventId;
    private long organizationId;
}
