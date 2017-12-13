package com.botscrew.bot.services.impl;

import com.botscrew.bot.model.Recipient;
import com.botscrew.bot.model.Sender;
import com.botscrew.bot.model.button.Button;
import com.botscrew.bot.model.button.ButtonPostback;
import com.botscrew.bot.model.button.ButtonUrl;
import com.botscrew.bot.model.messages.*;
import com.botscrew.bot.model.messages.button_template.ButtonTemplateAttachment;
import com.botscrew.bot.model.messages.button_template.ButtonTemplatePayload;
import com.botscrew.bot.model.messages.generic_template.GenericTemplateAttachment;
import com.botscrew.bot.model.messages.generic_template.GenericTemplateElement;
import com.botscrew.bot.model.messages.generic_template.GenericTemplatePayload;
import com.botscrew.bot.model.requests.ButtonTemplateRequest;
import com.botscrew.bot.model.requests.GenericTemplateRequest;
import com.botscrew.bot.model.requests.QuickReplayRequest;
import com.botscrew.bot.model.requests.SimpleMessageRequest;
import com.botscrew.bot.services.SendMessage;
import org.springframework.web.client.RestTemplate;

public class SendMessageImpl implements SendMessage {


    @Override
    public void sendSimpleMessage(Sender recipient, String text) {

        SimpleMessageRequest request = new SimpleMessageRequest();
        request.setRecipient(new Recipient(recipient.getId()));
        request.setMessage(new SimpleMessage(text));
        RestTemplate restTemplate = new RestTemplate();
        request.setMessanging_type("RESPONSE");


        restTemplate.postForLocation(URL, request, SimpleMessageRequest.class);
    }
    @Override
    public void sendQuickReplayMessage(Sender recipient) {

        QuickReplayRequest request = new QuickReplayRequest();
        request.setRecipient(new Recipient(recipient.getId()));

        QuickReplay quickReplay = new QuickReplay();
        quickReplay.setContent_type("text");
        quickReplay.setTitle("search");
        quickReplay.setPayload("payloud");

        QuickReplay quickReplay1 = new QuickReplay();
        quickReplay1.setContent_type("text");
        quickReplay1.setTitle("search1");
        quickReplay1.setPayload("payloud1");

        request.setMessage(new QuickReplayMessage("text", new QuickReplay[]{quickReplay, quickReplay1}));

        RestTemplate restTemplate = new RestTemplate();

        restTemplate.postForLocation(URL, request, QuickReplayRequest.class);
    }

    @Override
    public void sendGenericTemplateMessage(Sender recipient) {
        GenericTemplateRequest request = new GenericTemplateRequest();
        request.setRecipient(new Recipient(recipient.getId()));

        GenericTemplateMessage message = new GenericTemplateMessage();
        GenericTemplateAttachment attachment = new GenericTemplateAttachment();
        attachment.setType("template");
        GenericTemplatePayload payload = new GenericTemplatePayload();
        payload.setTemplate_type("generic");
        GenericTemplateElement element1 = new GenericTemplateElement();
        element1.setTitle("Welcome to Piter");
        element1.setSubtitle("Yeap! Piter!");

        GenericTemplateElement element2 = new GenericTemplateElement();
        element2.setTitle("Welcome to Piter2");
        element2.setSubtitle("Yeap! Piter2!");

        payload.setElements(new GenericTemplateElement[]{element1, element2});

        attachment.setPayload(payload);

        message.setAttachment(attachment);
        request.setMessage(message);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForLocation(URL, request, GenericTemplateRequest.class);
    }

    @Override
    public void sendButtonTemplateMessage(Sender recipient) {

        ButtonTemplateRequest request = new ButtonTemplateRequest();
        request.setRecipient(new Recipient(recipient.getId()));

        ButtonTemplateMessage message = new ButtonTemplateMessage();
        ButtonTemplateAttachment attachment = new ButtonTemplateAttachment();

        attachment.setType("template");
        ButtonTemplatePayload payload = new ButtonTemplatePayload();
        payload.setTemplate_type("button");
        payload.setText("BUtton template test");

        ButtonPostback button1 = new ButtonPostback();
        button1.setTitle("button1");
        button1.setPayload("lol");

        payload.setButtons(new Button[]{button1});

        attachment.setPayload(payload);
        message.setAttachment(attachment);

        request.setMessage(message);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForLocation(URL, request, ButtonTemplateRequest.class);

    }
}
