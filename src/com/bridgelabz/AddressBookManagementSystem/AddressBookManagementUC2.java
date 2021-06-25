package com.bridgelabz.AddressBookManagementSystem;

import java.util.Scanner;

public class AddressBookManagementUC2 {

	AddressBookManagementUC2 contact;
	Scanner sc = new Scanner(System.in);
	private String firstName;

	public void add() {
		contact = new AddressBookManagementUC2();
		System.out.println("Please Enter Following data....!");
		System.out.println("Enter First Name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter last Name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter your address: ");
		String address = sc.nextLine();
		System.out.println("Enter your city: ");
		String city = sc.nextLine();
		System.out.println("Enter your state: ");
		String state = sc.nextLine();
		System.out.println("Enter zip code of your area: ");
		Long zipCode = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter phone number: ");
		Long phoneNum = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter EMail ID: ");
		String email = sc.nextLine();

		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		contact.setAddress(address);
		contact.setCity(city);
		contact.setState(state);
		contact.setZipCode(zipCode);
		contact.setPhoneNumber(phoneNum);
		contact.setEmail(email);
		// System.out.println(contact);

	}

	private void setEmail(String email) {
		// TODO Auto-generated method stub

	}

	private void setPhoneNumber(Long phoneNum) {
		// TODO Auto-generated method stub

	}

	private void setZipCode(Long zipCode) {
		// TODO Auto-generated method stub

	}

	private void setState(String state) {
		// TODO Auto-generated method stub

	}

	private void setCity(String city) {
		// TODO Auto-generated method stub

	}

	private void setLastName(String lastName) {
		// TODO Auto-generated method stub

	}

	private void setAddress(String address) {
		// TODO Auto-generated method stub

	}

	private void setFirstName(String firstName) {
		// TODO Auto-generated method stub

	}

	public void editContact() {
		System.out.println("Enter First Name of Persion");
		String editName = sc.nextLine();
		if (editName.equalsIgnoreCase(contact.firstName)) {
			add();
			// System.out.println(contact);
		} else {
			System.out.println("Invalid Name......!");
			System.out.println("Please enter valid First Name");
			editContact();
		}

	}
}