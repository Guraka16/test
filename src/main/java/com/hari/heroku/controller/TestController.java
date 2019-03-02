package com.hari.heroku.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hari.heroku.entity.Person;
//import com.hari.heroku.service.PersonService;

@RestController
public class TestController {
	
	@Autowired
	Person person;
	
	/*@Autowired
	PersonService personService;
	*/
	
	
	@GetMapping("/")
	public  String getPersonDetails()
	{
		String str = person.getFirstName(); 
		String str1 = person.getLastName();
		String str2 = person.getEmail();
		String string = str+" "+str1+"  :"+str2;
		return string;
			
	}

}
