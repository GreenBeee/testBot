package com.botscrew.bot.model.button;

public class ButtonCall extends Button {

    private final String type = "phone_number";
    private String payload;
    private String title;

    public String getType() {
        return type;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ButtonCall() {

    }

    public ButtonCall(String payload, String title) {

        this.payload = payload;
        this.title = title;
    }
}
