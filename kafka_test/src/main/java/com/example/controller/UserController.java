package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

@RestController
@RequestMapping("kafka")
public class UserController {
	
	@Autowired
	private KafkaTemplate<String , Object> kafkaTemplate;
	private static final String TOPIC="test";
	
	@GetMapping("/publish/{message}")
	public String get(@PathVariable("message") final String message)
	{
		
		kafkaTemplate.send(TOPIC, message);
		return "publish successfully";
	}
	
	@PostMapping("/user")
	public String post(@RequestBody Employee emp)
	{
		
		kafkaTemplate.send(TOPIC, emp);
		return "user deatils send successfully";
	}

}
