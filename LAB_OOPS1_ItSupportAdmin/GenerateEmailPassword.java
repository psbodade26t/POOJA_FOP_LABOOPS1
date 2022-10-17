package com.LAB_OOPS1_ItSupportAdmin;

//task is to create Credentials for New Hires.
//task divided into 3 parameters.
//1)Generate Email Address, 2)Generate Password, 3)Display Credentials
import java.util.Scanner;
import java.util.Random;

public class GenerateEmailPassword { 	// 1)Generate Email Address for new hires
	private String firstName;
	private String lastName;
	private String email;
	private String password; 	// password will be like : Abc2@3 so we took datatype as String
	private int defaultPasswordLength = 8;
	private String department; 	// department where employ work
	private String companySuffix = "learning.com";// this is to show that email will looks like: abc@learning.com

//Department of 4 types:1)Technical 2)Admin 3)Human Resource 4)Legal
	private String setDepartment() { 	// Display the department names
		System.out.println(
				"Please Enter the Department from the following:\n1.Technical \n2.Admin \n3.Human Resource \n4.Legal");
		Scanner sc = new Scanner(System.in); // intialiaze the Scanner class
		int choice = sc.nextInt(); // Choice for selection of dept
		// we can use if else or switch statements
		if (choice == 1) {
			return "technical";
		} else if (choice == 2) {
			return "admin";
		} else if (choice == 3) {
			return "hr";
		} else if (choice == 4) {
			return "legal";
		} else {
			return " ";
		}
	}

//Generate a Random password which will contain 1)Numbers 2)Capital letters 3)Small letters 4)Special characters
	private String randomPassword(int length) {
		String passwordSet = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*";
		char[] password = new char[length];// password length is 8
		for (int i = 0; i < length; i++) { // loop is used to generate the password of length 8
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

//use paramatrized constructor for class Employee, to pass firstName, lastName
	public GenerateEmailPassword(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		// System.out.println("Department: "+this.department);

		// combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		// System.out.println("Email: "+email);

		// call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		// System.out.println("Password : "+this.password+"\n");
	}

//Display the generated credentials
	public String showinfo() {
		return "\n"+"Dear " + firstName + " your generated credentials are as follows" + "\nEmail   ---> " + email
				+ "\nPassword---> " + password + "\n";
	}
}
