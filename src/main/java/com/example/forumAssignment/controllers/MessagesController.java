package com.example.forumAssignment.controllers;

import com.example.forumAssignment.models.Account;
import com.example.forumAssignment.models.Message;
import com.example.forumAssignment.repositories.AccountsRepository;
import com.example.forumAssignment.repositories.MessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/api/message")
public class MessagesController {

    @Autowired
    private MessagesRepository messagesRepository;
    @Autowired
    private AccountsRepository accountsRepository;

    @GetMapping
    public List<Message> messagesList() {
        return messagesRepository.findAll();
    }

    @PostMapping
    public void postMessage(@RequestBody @NotNull Message newMessage) {
        if (accountsRepository.findById(newMessage.getAccount().getAccountId()).isPresent()) {
            messagesRepository.save((newMessage));
        }

    }
}
