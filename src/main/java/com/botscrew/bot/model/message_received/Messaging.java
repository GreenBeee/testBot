package com.botscrew.bot.model.message_received;

import com.botscrew.bot.model.Recipient;
import com.botscrew.bot.model.Sender;
import com.botscrew.bot.model.message_received.message.TextMessage;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Messaging {

    private Sender sender;
    private Recipient recipient;

    private TextMessage message;

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public TextMessage getMessage() {
        return message;
    }

    public void setMessage(TextMessage message) {
        this.message = message;
    }

    public Messaging() {

    }

    public Messaging(Sender sender, Recipient recipient, TextMessage message) {

        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
    }
}
