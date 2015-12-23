package com.digitek.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitek.model.Person;

@RestController
public class MVCRestController {
	@RequestMapping("/")
	public String showMessege(){
		return " Default Messege Return....(REST Service..)";
		
	}
	@RequestMapping(value="/show")
	public String RestGetMessege(@RequestParam("name") String messege){
		
		return "This is messge from "+messege;
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String SaveMessege(@RequestBody Person person){
		System.out.println("Saving Address..."+person.getAddress());
		return "Person Address Saved";
	}
	
	
	
}
