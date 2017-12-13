package com.botscrew.bot.model.message_received.message;

import com.botscrew.bot.model.message_received.Attachment;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TextMessage {

    private String text;
    private Attachment[] attachments;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextMessage() {

    }

    public TextMessage(String text) {

        this.text = text;
    }
}
