package com.mldtsv.service;

import java.util.List;

public interface NotificationService {

    void pushNotification(List<String> users, String message);
    void sendMessage(List<String> users, String message);
}
