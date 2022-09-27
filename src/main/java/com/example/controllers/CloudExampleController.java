package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Message;

@RestController
@RequestMapping("/example/")
public class CloudExampleController {

	@GetMapping("hello/{message}")
public Message printHello(@PathVariable String message) {
		Message messageO=new Message();
		messageO.setMessage(message);
		return messageO;
		
	}
	
}
