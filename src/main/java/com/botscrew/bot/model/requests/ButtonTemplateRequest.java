package com.botscrew.bot.model.requests;

import com.botscrew.bot.model.Recipient;
import com.botscrew.bot.model.messages.ButtonTemplateMessage;

public class ButtonTemplateRequest {

    private Recipient recipient;
    private ButtonTemplateMessage message;

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public ButtonTemplateMessage getMessage() {
        return message;
    }

    public void setMessage(ButtonTemplateMessage message) {
        this.message = message;
    }

    public ButtonTemplateRequest() {

    }

    public ButtonTemplateRequest(Recipient recipient, ButtonTemplateMessage message) {

        this.recipient = recipient;
        this.message = message;
    }
}
