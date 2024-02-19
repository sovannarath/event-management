package com.example.events.models.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
public class EventDto {
    private long id;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private Time startTime;
    private Time endTime;
    private String status;
    private long userId;
    private long organizationId;
    private boolean deleted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

}
