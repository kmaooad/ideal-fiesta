package com.mldtsv.service.impl;

import com.mldtsv.FireBaseSdkClient;
import com.mldtsv.WebSocketSdkClient;
import com.mldtsv.service.NotificationService;

import java.util.List;

public class NotificationServiceImpl implements NotificationService {

    private final FireBaseSdkClient fireBaseSdkClient;
    private final WebSocketSdkClient webSocketSdkClient;

    public NotificationServiceImpl(FireBaseSdkClient fireBaseSdkClient, WebSocketSdkClient webSocketSdkClient) {
        this.fireBaseSdkClient = fireBaseSdkClient;
        this.webSocketSdkClient = webSocketSdkClient;
    }

    public void pushNotification(List<String> users, String message) {}

    public void sendMessage(List<String> users, String message) {}
}
