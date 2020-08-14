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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("kafka")
@Api(value = "Kafka Rest API", description = "Kafka Producer API Controller")
public class UserController {
	
	@Autowired
	private KafkaTemplate<String , Object> kafkaTemplate;
	private static final String TOPIC="mytopic";
	
	@GetMapping("/publish/{message}")
	@ApiOperation(value = "Publish kafka message")
	public String get(@PathVariable("message") final String message)
	{
		
		kafkaTemplate.send(TOPIC, message);
		return "publish successfully";
	}
	
	@PostMapping("/user")
	@ApiOperation(value = "Publish kafka json body")
	public String post(@RequestBody Employee emp)
	{
		
		kafkaTemplate.send(TOPIC, emp);
		return "user deatils send successfully";
	}

}
