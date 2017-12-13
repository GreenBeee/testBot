package com.botscrew.bot.services;

import com.botscrew.bot.model.Sender;

public interface SendMessage {


    String PAGE_TOKEN = "EAAUTes48oVYBAF6ZCK7dV2X8irf2665nyea98zsxGxewkV0yW45SSZAZCxnv3ViYQlDeLnvagOsN4pVKdN" +
            "2PXzgeTncpaPX89I7bAZCZCkVHIh0cRh3aG68KIYFdtpZB7fQfNuugaunSkhGxpVUxyiaqXgZByOXNYDmPw5QyBZBOhAZDZD";
    String URL = "https://graph.facebook.com/v2.6/me/messages?access_token=" + PAGE_TOKEN;

    void sendSimpleMessage(Sender recipient, String text);
    void sendQuickReplayMessage(Sender recipient);
    void sendGenericTemplateMessage(Sender recipient);
    void sendButtonTemplateMessage(Sender recipient);
}
