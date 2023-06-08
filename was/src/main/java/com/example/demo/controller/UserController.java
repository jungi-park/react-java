package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.User;
import com.example.demo.service.UserService;


@RestController
public class UserController {
	@Autowired
	private  UserService userService;
	
	@GetMapping("/user")
    public List<User> user() {
        return userService.getUserList();
    }

	@GetMapping("/hello")
	public String hi() {
		return "hi there~";
	}

}
