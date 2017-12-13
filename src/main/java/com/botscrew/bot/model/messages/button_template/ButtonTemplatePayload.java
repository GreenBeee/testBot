package com.botscrew.bot.model.messages.button_template;

import com.botscrew.bot.model.button.Button;

public class ButtonTemplatePayload {

    private String template_type;
    private String text;
    private Button[] buttons;

    public String getTemplate_type() {
        return template_type;
    }

    public void setTemplate_type(String template_type) {
        this.template_type = template_type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Button[] getButtons() {
        return buttons;
    }

    public void setButtons(Button[] buttons) {
        this.buttons = buttons;
    }

    public ButtonTemplatePayload() {

    }

    public ButtonTemplatePayload(String template_type, String text, Button[] buttons) {

        this.template_type = template_type;
        this.text = text;
        this.buttons = buttons;
    }
}
