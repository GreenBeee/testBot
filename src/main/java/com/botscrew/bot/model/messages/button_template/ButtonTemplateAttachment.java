package com.botscrew.bot.model.messages.button_template;

public class ButtonTemplateAttachment {

    private String type;
    private ButtonTemplatePayload payload;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ButtonTemplatePayload getPayload() {
        return payload;
    }

    public void setPayload(ButtonTemplatePayload payload) {
        this.payload = payload;
    }

    public ButtonTemplateAttachment() {

    }

    public ButtonTemplateAttachment(String type, ButtonTemplatePayload payload) {

        this.type = type;
        this.payload = payload;
    }
}
