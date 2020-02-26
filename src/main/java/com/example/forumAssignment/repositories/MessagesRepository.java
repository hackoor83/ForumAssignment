package com.example.forumAssignment.repositories;

import com.example.forumAssignment.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepository extends JpaRepository<Message, Long> {
}
