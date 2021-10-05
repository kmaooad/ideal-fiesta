package com.mldtsv.service.impl;

import com.mldtsv.WebSocketSdkClient;
import com.mldtsv.service.MessageService;

import java.util.List;

public class MessageServiceImpl implements MessageService {

    private WebSocketSdkClient webSocketSdkClient;

    public MessageServiceImpl(WebSocketSdkClient webSocketSdkClient) {
        this.webSocketSdkClient = webSocketSdkClient;
    }

    @Override
    public void sendMessage(List<String> users, String message) {

    }
}
