package com.example.forumAssignment.repositories;

import com.example.forumAssignment.models.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicsRepository extends JpaRepository<Topic, Long> {
}
