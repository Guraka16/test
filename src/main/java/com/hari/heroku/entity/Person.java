package com.hari.heroku.entity;

import org.springframework.stereotype.Component;

@Component
public class Person  {

	private String firstName;
	private String lastName;
	private String email;

	public Person() {
	}

	/*public Person(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
*/
	public String getFirstName() {
		firstName = "HariBabu";
		return firstName;
	}

	public void setFirstName(String firstName) {
			this.firstName = firstName;
	}

	public String getLastName() {
		lastName = "Guraka";
			return lastName;
	}

	public void setLastName(String lastName) {
			this.lastName = lastName;
	}

	public String getEmail() {
		email = "haribabu.g77@gmail.com";
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

}
