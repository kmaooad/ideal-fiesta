package com.mldtsv;

import com.mldtsv.service.NotificationService;

public class ChatsController {

    private final NotificationService notificationService;

    public ChatsController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void addParticipant(AddParticipantRequestDTO request) {
        notificationService.pushNotification(request.getAddParticipants(), request.serialize());
    }

    public void sendMesssage(String sender, String chatId, String message) {}
}
