package com.example.ecommerceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ecommerceapp.entity.Product;
import com.example.ecommerceapp.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/add/product")
	public String addProduct(Product product) {
		productService.createProduct(product);
		
		return "redirect:/admin/home";
	}
	
	@GetMapping("/update/product/{id}")
	public String updateProduct(@PathVariable Long id, Model model) {
		model.addAttribute("product", productService.getProductById(id));
		
		return "UpdateProduct";
	}
	
	@PostMapping("/update/product")
	public String updateProduct(Product product) {
		productService.updateProduct(product);
		
		return "redirect:/admin/home";
	}
	
	@GetMapping("/delete/product/{id}")
	public String deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
		
		return "redirect:/admin/home";
	}
	
}