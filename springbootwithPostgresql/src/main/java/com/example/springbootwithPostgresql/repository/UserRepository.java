package com.example.springbootwithPostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootwithPostgresql.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}