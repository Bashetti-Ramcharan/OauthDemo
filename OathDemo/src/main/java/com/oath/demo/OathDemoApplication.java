package com.oath.demo;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OathDemoApplication 
{
	@GetMapping
	public String welcome()
	{
		return "Welcome to google!!";
	}
	
	@GetMapping("/user")
	public Principal user(Principal principal)
	{
		System.out.println("UserName"+principal.getName());
		return principal;
	}
	public static void main(String[] args) 
	{
		SpringApplication.run(OathDemoApplication.class, args);
	}

}
