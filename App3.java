package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod; 
@RestController
public class App3 {
	
	@RequestMapping(value="/Myfav/{color}",method=RequestMethod.GET)
	public String Myfav(@PathVariable String color)
	{
		return "My Favorite Colour is "+color;
	}

}
