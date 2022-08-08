package com.develop.socket_api.service;

import java.time.LocalDateTime;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class WebSocketService {

    private SimpMessagingTemplate messagingTemplate;

    public WebSocketService(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }
    
    public void sendMessage(String message) {
        messagingTemplate.convertAndSend("/watch", message);
    }

    public void sendToUser(String username, String message) {
        // Using simple broker
        messagingTemplate.convertAndSendToUser(username, "/message", message);
    }

    @Scheduled(cron = "0/5 * * * * *")
    public void sendScheduled() {
        messagingTemplate.convertAndSend("/scheduled", LocalDateTime.now());
    }

}
