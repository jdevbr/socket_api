package com.develop.socket_api.controller;

import com.develop.socket_api.service.WebSocketService;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    private WebSocketService socketService;

    public WebSocketController(WebSocketService socketService) {
        this.socketService = socketService;
    }
    
    @MessageMapping("/message")
    public void sendMessage(@Payload String message) {
        socketService.sendMessage(message);
    }

}
