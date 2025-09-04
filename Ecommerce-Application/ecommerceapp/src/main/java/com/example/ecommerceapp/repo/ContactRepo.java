package com.example.ecommerceapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerceapp.entity.Message;

public interface ContactRepo extends JpaRepository<Message, Long> {

}
