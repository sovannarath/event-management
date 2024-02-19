package com.example.events.models.dto;

import com.example.events.commons.enums.Gender;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
public class UserDto {
    private long id;
    private String name;
    private Gender gender;
    private Date dateOfBirth;
    private String placeOfBirth;
    private String email;
    private String phoneNumber;
    private String currentAddress;
    private long organizationId;
    private long roleId;
    private boolean deleted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
