package com.botscrew.bot.model.requests;

import com.botscrew.bot.model.Recipient;
import com.botscrew.bot.model.messages.QuickReplayMessage;

public class QuickReplayRequest {

    private Recipient recipient;
    private QuickReplayMessage message;

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public QuickReplayMessage getMessage() {
        return message;
    }

    public void setMessage(QuickReplayMessage message) {
        this.message = message;
    }

    public QuickReplayRequest() {

    }

    public QuickReplayRequest(Recipient recipient, QuickReplayMessage message) {

        this.recipient = recipient;
        this.message = message;
    }
}
