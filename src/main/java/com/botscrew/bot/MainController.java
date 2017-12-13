package com.botscrew.bot;

import com.botscrew.bot.model.Sender;
import com.botscrew.bot.model.message_received.MessageReceived;
import com.botscrew.bot.services.SendMessage;
import com.botscrew.bot.services.SendPermission;
import com.botscrew.bot.services.impl.SendMessageImpl;
import com.botscrew.bot.services.impl.SendPermissionImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {


    private static final String VERIFY_TOKEN = "test";

    @RequestMapping(value = "/webhook", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> doGet(@RequestParam("hub.verify_token") String token,
                                        @RequestParam("hub.challenge") String challenge,
                                        @RequestParam("hub.mode") String mode) {

        if (token.equals(VERIFY_TOKEN) && mode.equals("subscribe")) {
            return new ResponseEntity<>(challenge, HttpStatus.OK);
        }
        return new ResponseEntity<>(challenge, HttpStatus.BAD_REQUEST);
    }


    @RequestMapping(value = "/webhook", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> doPost(@RequestBody MessageReceived messageReceived) {

        Sender sender = messageReceived.getEntry()[0].getMessaging()[0].getSender();

        SendPermission permission = new SendPermissionImpl();
        permission.sendPermission(sender);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
