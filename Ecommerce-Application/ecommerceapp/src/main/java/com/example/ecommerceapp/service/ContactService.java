package com.example.ecommerceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerceapp.entity.Message;
import com.example.ecommerceapp.repo.ContactRepo;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepo contactRepo;
	
	public List<Message> getAllMessage() {
		return contactRepo.findAll();
	}
	
	public Message getMessageById(Long id) {
		return contactRepo.findById(id).orElseThrow(() -> new RuntimeException("Message with id " + id + " not found"));
	}
	
	public void createMessage(Message Message) {
		contactRepo.save(Message);
	}
	
	public void updateMessage(Message Message) {
		contactRepo.findById(Message.getId()).orElseThrow(() -> new RuntimeException("Message with id " + Message.getId() + " not found"));
		contactRepo.save(Message);
	}
	
	public void deleteMessage(Long id) {
		contactRepo.findById(id).orElseThrow(() -> new RuntimeException("Message with id " + id + " not found"));
		contactRepo.deleteById(id);
	}

}