package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.UserEntity;
import com.simplilearn.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	 @Autowired
	  UserService userService;

	
		@GetMapping("/listUsers")
		public String listUsers(Model model) {
			
			List<UserEntity> users = userService.getUsers();
			model.addAttribute("users", users);
			
			return "list-users";
		}


}
