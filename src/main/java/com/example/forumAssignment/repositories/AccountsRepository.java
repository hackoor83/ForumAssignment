package com.example.forumAssignment.repositories;

import com.example.forumAssignment.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Account, Long> {
}
