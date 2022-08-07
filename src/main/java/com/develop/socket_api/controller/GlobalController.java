package com.develop.socket_api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.develop.socket_api.service.WebSocketService;

@RestController
public class GlobalController {
    
    private WebSocketService socketService;

    public GlobalController(WebSocketService socketService) {
        this.socketService = socketService;
    }

    @PostMapping("send")
    public void sendToAll(@RequestBody String message) {
        socketService.sendMessage(message);
    }
}
