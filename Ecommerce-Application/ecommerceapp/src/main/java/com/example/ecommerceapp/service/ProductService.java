package com.example.ecommerceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerceapp.entity.Product;
import com.example.ecommerceapp.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;

	public List<Product> getAllProduct() {
		return productRepo.findAll();
	}
	
	public Product getProductById(Long id) {
		return productRepo.findById(id).orElseThrow(() -> new RuntimeException("Product with id " + id + " not found"));
	}
	
	public void createProduct(Product Product) {
		productRepo.save(Product);
	}
	
	public void updateProduct(Product Product) {
		productRepo.findById(Product.getId()).orElseThrow(() -> new RuntimeException("Product with id " + Product.getId() + " not found"));
		productRepo.save(Product);
	}
	
	public void deleteProduct(Long id) {
		productRepo.findById(id).orElseThrow(() -> new RuntimeException("Product with id " + id + " not found"));
		productRepo.deleteById(id);
	}
	
	public Product findProductByName(String name) {
		return productRepo.findByName(name);
	}
	
}