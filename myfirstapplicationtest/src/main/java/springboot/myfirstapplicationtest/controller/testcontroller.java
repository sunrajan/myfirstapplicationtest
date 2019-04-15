package springboot.myfirstapplicationtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

@RestController
public class testcontroller {

	@RequestMapping("")

	public String home() {

	return "Spring boot is working! great !!";

	}
	
	@RequestMapping("/test")

	public String home1() {

	return "Spring boot is test working! great !!";

	}

	}
