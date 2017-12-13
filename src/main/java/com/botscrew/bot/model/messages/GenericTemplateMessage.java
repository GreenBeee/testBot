package com.botscrew.bot.model.messages;

import com.botscrew.bot.model.messages.generic_template.GenericTemplateAttachment;

public class GenericTemplateMessage {

    private GenericTemplateAttachment attachment;

    public GenericTemplateMessage() {

    }

    public GenericTemplateMessage(GenericTemplateAttachment attachment) {

        this.attachment = attachment;
    }

    public GenericTemplateAttachment getAttachment() {
        return attachment;
    }

    public void setAttachment(GenericTemplateAttachment attachment) {
        this.attachment = attachment;
    }
}
