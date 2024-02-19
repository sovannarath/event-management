package com.example.events.models.dao.repositories;

import com.example.events.models.dao.entities.NotificationReceiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationReceiverRepository extends JpaRepository<NotificationReceiver, Long> {
}
