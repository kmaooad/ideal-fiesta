package com.mldtsv;

import java.util.List;

public class AddParticipantRequestDTO {
    private String userId;
    private String chatId;
    private List<String> addParticipants;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public List<String> getAddParticipants() {
        return addParticipants;
    }

    public void setAddParticipants(List<String> addParticipants) {
        this.addParticipants = addParticipants;
    }

    public String serialize() { return ""; }
}
