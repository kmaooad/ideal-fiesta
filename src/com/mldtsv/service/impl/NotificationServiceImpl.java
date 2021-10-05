package com.mldtsv.service.impl;

import com.mldtsv.FireBaseSdkClient;
import com.mldtsv.service.NotificationService;

import java.util.List;

public class NotificationServiceImpl implements NotificationService {

    private final FireBaseSdkClient fireBaseSdkClient;

    public NotificationServiceImpl(FireBaseSdkClient fireBaseSdkClient) {
        this.fireBaseSdkClient = fireBaseSdkClient;
    }

    public void pushNotification(List<String> users, String message) {}
}
