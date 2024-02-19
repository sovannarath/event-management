package com.example.events.services.interfaces;

import com.example.events.models.dao.entities.NotificationReceiver;

import java.util.List;

public interface NotificationReceiverService {
    List<NotificationReceiver> getAll();
    NotificationReceiver getById(long id);
    //NotificationReceiver update(NotificationReceiverDto notificationReceiverDto);
    NotificationReceiver softDelete(long id);
}
