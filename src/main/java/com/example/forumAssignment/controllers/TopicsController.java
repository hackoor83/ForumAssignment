package com.example.forumAssignment.controllers;

import com.example.forumAssignment.models.Topic;
import com.example.forumAssignment.repositories.TopicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/topic")
public class TopicsController {

    @Autowired
    private TopicsRepository topicsRepository;

    @GetMapping
    public List<Topic> getTopicsList(){
        return topicsRepository.findAll();
    }

    @PostMapping
    public void postTopic(@RequestBody Topic newTopic){

        topicsRepository.save(newTopic);
    }
}
