package com.botscrew.bot.model.message_received;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entry {

    private String id;
    private Number time;
    private Messaging[] messaging;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Number getTime() {
        return time;
    }

    public void setTime(Number time) {
        this.time = time;
    }

    public Messaging[] getMessaging() {
        return messaging;
    }

    public void setMessaging(Messaging[] messaging) {
        this.messaging = messaging;
    }

    public Entry() {

    }

    public Entry(String id, Number time, Messaging[] messaging) {

        this.id = id;
        this.time = time;
        this.messaging = messaging;
    }
}
