package com.botscrew.bot.model.messages;

public class SimpleMessage {

    private String text;

    public SimpleMessage() {
    }

    public SimpleMessage(String text) {

        this.text = text;
    }

    public String getText() {

        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
