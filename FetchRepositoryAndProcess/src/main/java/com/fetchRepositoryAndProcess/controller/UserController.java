package com.fetchRepositoryAndProcess.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fetchRepositoryAndProcess.entity.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {
	@RequestMapping("/getUser")
	public void getUser() {
		
		String uri = "https://jsonplaceholder.typicode.com/todos/1";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		ObjectMapper objectMapper = new ObjectMapper();
		User user = new User();
		try {
			user = objectMapper.readValue(result, User.class);			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(user.toString());
	}
	
}
