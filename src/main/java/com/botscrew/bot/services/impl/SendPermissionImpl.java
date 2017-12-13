package com.botscrew.bot.services.impl;

import com.botscrew.bot.database.User;
import com.botscrew.bot.model.Sender;
import com.botscrew.bot.services.SendPermission;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class SendPermissionImpl implements SendPermission {
    @Override
    public boolean sendPermission(Sender recipient) {

        RestTemplate restTemplate = new RestTemplate();

        Map<String, String> uriParams = new HashMap<>();
        uriParams.put("senderId", recipient.getId());

        User user = restTemplate.getForObject(URL, User.class, uriParams);
        user.setId(recipient.getId());



        return user != null;
    }
}
