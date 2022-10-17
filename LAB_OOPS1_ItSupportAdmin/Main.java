package com.LAB_OOPS1_ItSupportAdmin;

//Driver class for generating emailid of the employees.
public class Main {
	public static void main(String[] args) {
		GenerateEmailPassword emp = new GenerateEmailPassword("Pooja", "Choudhari");
		System.out.println(emp.showinfo()); // display credentials
	}

}
