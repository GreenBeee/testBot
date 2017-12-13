package com.botscrew.bot.model.button;

public class ButtonPostback extends Button{

    private final String type = "postback";
    private String title;
    private String payload;

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public ButtonPostback() {

    }

    public ButtonPostback(String title, String payload) {

        this.title = title;
        this.payload = payload;
    }
}
