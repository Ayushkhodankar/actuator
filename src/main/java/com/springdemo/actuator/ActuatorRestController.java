package com.springdemo.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorRestController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello User!";
	}
}
