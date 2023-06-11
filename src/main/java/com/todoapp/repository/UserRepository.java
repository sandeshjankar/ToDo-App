package com.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}