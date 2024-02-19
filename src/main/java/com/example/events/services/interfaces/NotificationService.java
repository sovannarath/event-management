package com.example.events.services.interfaces;

import com.example.events.models.dao.entities.Notification;

import java.util.List;

public interface NotificationService {
    List<Notification> getAll();
    Notification getById(long id);
    //Notification update(NotificationDto notificationDto);
    Notification softDelete(long id);
}
