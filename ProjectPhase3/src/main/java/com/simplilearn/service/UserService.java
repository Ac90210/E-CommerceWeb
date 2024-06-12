package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.simplilearn.dao.UserDAO;
import com.simplilearn.entity.UserEntity;


@Service
public class UserService {

	@Autowired
	UserDAO userDAO;

	public List<UserEntity> getUsers() {
		return userDAO.getUsers();
	}

}
