package com.botscrew.bot.model.messages.generic_template;

import com.botscrew.bot.model.button.Button;
import com.botscrew.bot.model.button.ButtonUrl;

public class GenericTemplateElement {

    private String title;
    private String subtitle;
    private String image_url;
    private Object default_action;
    private Button[] buttons;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Object getDefault_action() {
        return default_action;
    }

    public void setDefault_action(Object default_action) {
        this.default_action = default_action;
    }

    public Button[] getButtons() {
        return buttons;
    }

    public void setButtons(Button[] buttons) {
        this.buttons = buttons;
    }

    public GenericTemplateElement() {

    }

    public GenericTemplateElement(String title, String subtitle, String image_url, Object default_action, Button[] buttons) {

        this.title = title;
        this.subtitle = subtitle;
        this.image_url = image_url;
        this.default_action = default_action;
        this.buttons = buttons;
    }
}
