package com.botscrew.bot.services;

import com.botscrew.bot.model.Sender;

public interface SendPermission {

    String PAGE_TOKEN = "EAAUTes48oVYBAF6ZCK7dV2X8irf2665nyea98zsxGxewkV0yW45SSZAZCxnv3ViYQlDeLnvagOsN4pVKdN" +
            "2PXzgeTncpaPX89I7bAZCZCkVHIh0cRh3aG68KIYFdtpZB7fQfNuugaunSkhGxpVUxyiaqXgZByOXNYDmPw5QyBZBOhAZDZD";
    String URL = "https://graph.facebook.com/v2.6/{senderId}?fields=first_name,last_name,profile_pic,locale," +
            "timezone,gender,is_payment_enabled&access_token=" + PAGE_TOKEN;

    boolean sendPermission(Sender recipient);
}
