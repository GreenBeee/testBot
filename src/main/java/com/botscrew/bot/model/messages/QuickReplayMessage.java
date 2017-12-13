package com.botscrew.bot.model.messages;

public class QuickReplayMessage {

    private String text;
    private QuickReplay[] quick_replies;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public QuickReplay[] getQuick_replies() {
        return quick_replies;
    }

    public void setQuick_replies(QuickReplay[] quick_replies) {
        this.quick_replies = quick_replies;
    }

    public QuickReplayMessage() {

    }

    public QuickReplayMessage(String text, QuickReplay[] quick_replies) {

        this.text = text;
        this.quick_replies = quick_replies;
    }
}
