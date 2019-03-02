/*package com.hari.heroku.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hari.heroku.entity.Person;

@Service
public class PersonService {
	
	public List<Person> persons = new ArrayList<Person>();
		
	Person person = new Person();
	public List<Person> getPersonDetails()
	{
		String str	= person.getFirstName() + person.getLastName() + person.getEmail();
		Person p = str;	
		return p;
	}
	
	public Person getPerson(String email)
	{
		return (Person) persons.stream().filter(t -> t.getEmail().equals(email));
	}
	public void addPerson(Person person)
	{
		persons.add(person);
	}
		
}
*/