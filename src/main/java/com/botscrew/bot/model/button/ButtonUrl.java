package com.botscrew.bot.model.button;

public class ButtonUrl extends Button {

    private final String type = "web_url";
    private String title;
    private String url;
    private String webview_height_ratio;
    private Boolean messenger_extension;
    private String fallback_url;
    private String webview_share_button;

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWebview_height_ratio() {
        return webview_height_ratio;
    }

    public void setWebview_height_ratio(String webview_height_ratio) {
        this.webview_height_ratio = webview_height_ratio;
    }

    public Boolean getMessenger_extension() {
        return messenger_extension;
    }

    public void setMessenger_extension(Boolean messenger_extension) {
        this.messenger_extension = messenger_extension;
    }

    public String getFallback_url() {
        return fallback_url;
    }

    public void setFallback_url(String fallback_url) {
        this.fallback_url = fallback_url;
    }

    public String getWebview_share_button() {
        return webview_share_button;
    }

    public void setWebview_share_button(String webview_share_button) {
        this.webview_share_button = webview_share_button;
    }

    public ButtonUrl() {

    }

    public ButtonUrl(String title, String url, String webview_height_ratio, Boolean messenger_extension, String fallback_url, String webview_share_button) {

        this.title = title;
        this.url = url;
        this.webview_height_ratio = webview_height_ratio;
        this.messenger_extension = messenger_extension;
        this.fallback_url = fallback_url;
        this.webview_share_button = webview_share_button;
    }
}
