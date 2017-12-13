package com.botscrew.bot.model.button;

import com.botscrew.bot.model.messages.GenericTemplateMessage;

public class ButtonShare extends Button {

    private final String type = "element_share";
    private GenericTemplateMessage share_content;

    public ButtonShare() {
    }

    public String getType() {

        return type;
    }

    public GenericTemplateMessage getShare_content() {
        return share_content;
    }

    public void setShare_content(GenericTemplateMessage share_content) {
        this.share_content = share_content;
    }

    public ButtonShare(GenericTemplateMessage share_content) {

        this.share_content = share_content;
    }
}
