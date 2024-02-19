package com.example.events.models.dto;

import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
public class NotificationReceiverDto {
    private long id;
    private long notificationId;
    private long userId;
    private String deviceId;
    private long organizationId;
    private boolean deleted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
