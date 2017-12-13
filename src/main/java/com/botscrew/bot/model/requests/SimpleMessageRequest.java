package com.botscrew.bot.model.requests;

import com.botscrew.bot.model.Recipient;
import com.botscrew.bot.model.messages.SimpleMessage;

public class SimpleMessageRequest {

    private String messaging_type;
    private Recipient recipient;
    private SimpleMessage message;

    public SimpleMessageRequest() {
    }
    public SimpleMessageRequest(String messangig_type, Recipient recipient, SimpleMessage message) {

        this.messaging_type = messangig_type;
        this.recipient = recipient;
        this.message = message;
    }

    public String getMessanging_type() {
        return messaging_type;
    }

    public void setMessanging_type(String messanging_type) {
        this.messaging_type = messanging_type;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public SimpleMessage getMessage() {
        return message;
    }

    public void setMessage(SimpleMessage message) {
        this.message = message;
    }
}
