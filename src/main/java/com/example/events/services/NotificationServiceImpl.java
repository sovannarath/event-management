package com.example.events.services;

import com.example.events.models.dao.entities.Notification;
import com.example.events.models.dao.repositories.NotificationRepository;
import com.example.events.services.interfaces.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    @Override
    public List<Notification> getAll() {
        return notificationRepository.findAll();
    }

    @Override
    public Notification getById(long id) {
        return notificationRepository.getReferenceById(id);
    }

    @Override
    public Notification softDelete(long id) {
        return new Notification();
    }
}
