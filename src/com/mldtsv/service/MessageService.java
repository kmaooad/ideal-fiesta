package com.mldtsv.service;

import java.util.List;

public interface MessageService {
    void sendMessage(List<String> users, String message);
}
