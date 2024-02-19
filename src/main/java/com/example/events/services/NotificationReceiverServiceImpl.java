package com.example.events.services;

import com.example.events.models.dao.entities.NotificationReceiver;
import com.example.events.models.dao.repositories.NotificationReceiverRepository;
import com.example.events.services.interfaces.NotificationReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NotificationReceiverServiceImpl implements NotificationReceiverService {

    @Autowired
    private NotificationReceiverRepository notificationReceiverRepository;

    @Override
    public List<NotificationReceiver> getAll() {
        return notificationReceiverRepository.findAll();
    }

    @Override
    public NotificationReceiver getById(long id) {
        return notificationReceiverRepository.getReferenceById(id);
    }

    @Override
    public NotificationReceiver softDelete(long id) {
        return new NotificationReceiver();
    }
}
