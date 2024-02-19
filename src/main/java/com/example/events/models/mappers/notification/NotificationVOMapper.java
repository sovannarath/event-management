package com.example.events.models.mappers.notification;

import com.example.events.models.dao.entities.Notification;
import com.example.events.models.dto.NotificationDto;
import com.example.events.models.mappers.notification.vo.NotificationCreateRequestVO;
import com.example.events.models.mappers.notification.vo.NotificationCreateResponseVO;
import com.example.events.models.mappers.notification.vo.NotificationResponseVO;
import com.example.events.models.mappers.notification.vo.NotificationUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NotificationVOMapper {

    NotificationVOMapper INSTANCE = Mappers.getMapper(NotificationVOMapper.class);

    NotificationDto fromNotificationCreateRequestVO(NotificationCreateRequestVO notificationCreateRequestVO);
    NotificationDto fromNotificationUpdateRequestVO(NotificationUpdateRequestVO notificationUpdateRequestVO);
    NotificationCreateResponseVO toNotificationCreateResponseVO(Notification notification);
    NotificationResponseVO toNotificationResponseVO(Notification notification);
    List<NotificationResponseVO> toListNotificationResponseVO(List<Notification> notification);

}

