package com.botscrew.bot.model.messages.generic_template;

import com.botscrew.bot.model.messages.generic_template.GenericTemplatePayload;

public class GenericTemplateAttachment {

    private String type;
    private GenericTemplatePayload payload;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GenericTemplatePayload getPayload() {
        return payload;
    }

    public void setPayload(GenericTemplatePayload payload) {
        this.payload = payload;
    }

    public GenericTemplateAttachment() {

    }

    public GenericTemplateAttachment(String type, GenericTemplatePayload payload) {

        this.type = type;
        this.payload = payload;
    }
}
