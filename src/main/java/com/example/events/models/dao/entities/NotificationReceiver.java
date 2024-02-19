package com.example.events.models.dao.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "notification_receive")
@Data
public class NotificationReceiver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "notification_id")
    private long notificationId;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "device_id")
    private String deviceId;

    @Column(name = "organization_id")
    private long organizationId;

    @Column(name = "deleted")
    private boolean deleted;

    @CreatedDate
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

}
