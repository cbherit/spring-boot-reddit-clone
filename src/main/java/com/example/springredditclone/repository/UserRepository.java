package com.example.springredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springredditclone.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}