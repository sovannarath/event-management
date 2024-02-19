package com.example.events.models.mappers.event.vo;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class EventResponseVO {
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
}
