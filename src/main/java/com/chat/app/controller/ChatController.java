package com.chat.app.controller;

import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController{
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        if(message.getSender() == null ||
                message.getSender().trim().isEmpty()) {
            message.setSender("Anonymous");
        }
        return message;
    }
    @GetMapping("/chat")
    public String chat(Model model) {
        model.addAttribute("title",
                "Real-Time Chat Application");
        return "chat";
    }
}