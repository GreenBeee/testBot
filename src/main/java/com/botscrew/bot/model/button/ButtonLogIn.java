package com.botscrew.bot.model.button;

public class ButtonLogIn extends Button {
    private final String type = "account_link";
    private String url;

    public ButtonLogIn() {

    }

    public ButtonLogIn(String url) {

        this.url = url;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
