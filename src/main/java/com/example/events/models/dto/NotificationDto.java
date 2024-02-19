package com.example.events.models.dto;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
public class NotificationDto {
    private long id;
    private String name;
    private String description;
    private long eventId;
    private long organizationId;
    private boolean deleted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

}
