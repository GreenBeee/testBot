package com.botscrew.bot.model.message_received;

public class Attachment {

    private String type;
    private String payload;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Attachment() {

    }

    public Attachment(String type, String payload) {

        this.type = type;
        this.payload = payload;
    }
}
