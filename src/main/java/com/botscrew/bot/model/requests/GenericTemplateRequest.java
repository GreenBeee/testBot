package com.botscrew.bot.model.requests;

import com.botscrew.bot.model.Recipient;
import com.botscrew.bot.model.messages.GenericTemplateMessage;

public class GenericTemplateRequest {

    private Recipient recipient;
    private GenericTemplateMessage message;

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public GenericTemplateMessage getMessage() {
        return message;
    }

    public void setMessage(GenericTemplateMessage message) {
        this.message = message;
    }

    public GenericTemplateRequest() {

    }

    public GenericTemplateRequest(Recipient recipient, GenericTemplateMessage message) {

        this.recipient = recipient;
        this.message = message;
    }
}
