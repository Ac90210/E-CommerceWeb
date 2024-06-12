package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.model.EProduct;
import com.simplilearn.service.EProductService;



@Controller
public class EProductController {
	
	@Autowired
	EProductService service;
	
	@GetMapping("/listProducts")
	public String listProduct(Model model) {
		
		List<EProduct> products = service.getProducts();
		model.addAttribute("products", products);
		
		return "list-products";
	}

}
