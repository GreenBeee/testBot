package com.botscrew.bot.model.message_received;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageReceived {

    private Object object;
    private Entry[] entry;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Entry[] getEntry() {
        return entry;
    }

    public void setEntry(Entry[] entry) {
        this.entry = entry;
    }

    public MessageReceived() {

    }

    public MessageReceived(Object object, Entry[] entry) {

        this.object = object;
        this.entry = entry;
    }
}