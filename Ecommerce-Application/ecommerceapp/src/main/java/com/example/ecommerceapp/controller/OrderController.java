package com.example.ecommerceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ecommerceapp.entity.Order;
import com.example.ecommerceapp.service.OrderService;

import ch.qos.logback.core.model.Model;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	
	
}
