package com.example.events.models.mappers.notification;

import com.example.events.models.dao.entities.Notification;
import com.example.events.models.dto.NotificationDto;
import com.example.events.models.mappers.notification.vo.NotificationCreateRequestVO;
import com.example.events.models.mappers.notification.vo.NotificationCreateResponseVO;
import com.example.events.models.mappers.notification.vo.NotificationResponseVO;
import com.example.events.models.mappers.notification.vo.NotificationUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NotificationVOMapper {

    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    NotificationDto fromNotificationCreateRequestVO(NotificationCreateRequestVO notificationCreateRequestVO);
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    NotificationDto fromNotificationUpdateRequestVO(NotificationUpdateRequestVO notificationUpdateRequestVO);
    NotificationCreateResponseVO toNotificationCreateResponseVO(Notification notification);
    NotificationResponseVO toNotificationResponseVO(Notification notification);
    List<NotificationResponseVO> toListNotificationResponseVO(List<Notification> notification);

}

