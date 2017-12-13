package com.botscrew.bot.model.messages;

import com.botscrew.bot.model.messages.button_template.ButtonTemplateAttachment;

public class ButtonTemplateMessage {

    private ButtonTemplateAttachment attachment;

    public ButtonTemplateAttachment getAttachment() {
        return attachment;
    }

    public void setAttachment(ButtonTemplateAttachment attachment) {
        this.attachment = attachment;
    }

    public ButtonTemplateMessage() {

    }

    public ButtonTemplateMessage(ButtonTemplateAttachment attachment) {

        this.attachment = attachment;
    }
}
