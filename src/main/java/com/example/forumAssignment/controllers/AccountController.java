package com.example.forumAssignment.controllers;

import com.example.forumAssignment.models.*;
import com.example.forumAssignment.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private AccountsRepository accountsRepository;

    @GetMapping
    public List<Account> getAccountsList(){
        return accountsRepository.findAll();
    }

    @PostMapping
    public void createAccount(@RequestBody Account newAccount){
        accountsRepository.save(newAccount);
    }
}
