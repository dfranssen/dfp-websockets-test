package be.ditavision.controller.websocket;

import be.ditavision.model.chat.ChatMessage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by dfranssen on 05/03/2017.
 */

@Controller
public class ChatController {


    @MessageMapping("/chat.message.{username}")
    public ChatMessage message(@Payload ChatMessage message, @DestinationVariable("username") String username) {
        message.setUserId(username);
        message.setFullName(username);
        message.setHostname(getHostname());
        return message;
    }

    public String getHostname() {
        String result;
        try {
            result = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException ex) {
            result = String.format("<unknown> : %s", ex.getMessage());
        }
        return result;
    }
}
