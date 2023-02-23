package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class App2 
{
@GetMapping("/{name}")
public String hello(@PathVariable String name)
{
	return "Hello "+name+"!";
}

}
