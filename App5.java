package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;
@RestController
public class App5 {
	@Value("Sumalini G V")
	private String name;
	@GetMapping("/")
	public String getName()
	{
		return name;
	}

}
