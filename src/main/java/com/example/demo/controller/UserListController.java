package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserListController {
	
	@GetMapping("/userList")
    public String userList() {
      return "Hello world!";
    }

}
