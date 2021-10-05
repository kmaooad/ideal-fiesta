package com.mldtsv;

import com.mldtsv.service.MessageService;
import com.mldtsv.service.NotificationService;

import java.util.ArrayList;
import java.util.List;

public class ChatsController {

    private final NotificationService notificationService;
    private final MessageService messageService;

    public ChatsController(NotificationService notificationService, MessageService messageService) {
        this.notificationService = notificationService;
        this.messageService = messageService;
    }

    public void addParticipant(AddParticipantRequestDTO request) {
        messageService.sendMessage(request.getAddParticipants(), request.serialize());
    }

    public void sendMesssage(String sender, String chatId, String message) {
        var chatParticipants = new ArrayList<String>();
        messageService.sendMessage(chatParticipants, message);
        notificationService.pushNotification(chatParticipants, message);
    }
}
