package com.bridgelabz.AddressBookManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Ability to delete a person using person's name 

public class AddressBookManagementDeleteUC4 {

//class Contacts{
	Scanner userInputs = new Scanner(System.in);

	// attributes
	String email;
	String fName, lName, address, city, state;
	Long zipCode, phoneNum;

	// to return data to object by user inputs
	public void setContactsDetails() {
		System.out.println("Enter your First name: ");
		this.fName = userInputs.nextLine();
		System.out.println("Enter your Last name: ");
		this.lName = userInputs.nextLine();
		System.out.println("Enter your Address: ");
		this.address = userInputs.nextLine();
		System.out.println("Enter your City name: ");
		this.city = userInputs.nextLine();
		System.out.println("Enter your State name: ");
		this.state = userInputs.nextLine();
		System.out.println("Enter your Pin Code: ");
		this.zipCode = userInputs.nextLong();
		System.out.println("Enter your Phone Number: ");
		this.phoneNum = userInputs.nextLong();
		System.out.println("Enter your Email ID: ");
		this.email = userInputs.nextLine();
	}

	// to read data from contacts
	public String showContactsDetails() {
		return ("------------------------\nFirst Name: " + fName + "\nLast Name: " + lName + "\nAddress: " + address
				+ "\nCity: " + city + "\nState: " + state + "\nPin Code: " + zipCode + "\nPhone Number: " + phoneNum
				+ "\nEmail ID: " + email + "\n-------------------------");
	}

	// get complete details of person

	public String getFirstName() {
		return fName;
	}

// public class AddressBookMain {

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book");

		List<AddressBookManagementDeleteUC4> persons = new ArrayList<>();

		Scanner uc = new Scanner(System.in);
		System.out.println(
				"If you want to add address enter '0' or \nfor editing existing address enter '1' and \nfor deleting enter '2': ");
		int userChoice = uc.nextInt();

		if (userChoice == 0) {
			// adding contact details to address book
			System.out.println("Adding a new Address");

			Scanner n = new Scanner(System.in);
			System.out.println("How many contacts do you want to add to address book: ");
			int noOfPersons = n.nextInt();

			for (int i = 0; i < noOfPersons; i++) {
				AddressBookManagementDeleteUC4 contact = new AddressBookManagementDeleteUC4();
				contact.setContactsDetails();
				persons.add(contact);
				System.out.println(contact.showContactsDetails());
			}

			System.out.println(persons);

			Scanner new1 = new Scanner(System.in);
			System.out.println("Do you want you edit the contacts /nIf 'YES' Enter : '0' /nIf 'NO' Enter : '1'--->: ");
			int userChoice2 = new1.nextInt();

			if (userChoice2 == 0) {

				System.out.println("Editing a contact");

				System.out.println(persons);
				System.out.println("Which contact do you want to edit from address book: ");
				Scanner input = new Scanner(System.in);
				String editContact = input.next();

				for (AddressBookManagementDeleteUC4 i : persons) {

					if (i.getFirstName().equals(editContact)) {

						System.out.println("Change the First Name: ");
						String editfName = input.nextLine();
						i.fName = editfName;

						System.out.println("Change the Last Name: ");
						String editlName = input.nextLine();
						i.lName = editlName;

						System.out.println("Change the Address: ");
						String editAddress = input.nextLine();
						i.address = editAddress;

						System.out.println("Change the City: ");
						String editCity = input.nextLine();
						i.city = editCity;

						System.out.println("Change the State: ");
						String editState = input.nextLine();
						i.state = editState;

						System.out.println("Change the Pin Code: ");
						Long editZipCode = input.nextLong();
						i.zipCode = editZipCode;

						System.out.println("Change the Phone Number: ");
						Long editPhoneNum = input.nextLong();
						i.phoneNum = editPhoneNum;

						System.out.println("Change the Email ID: ");
						String editEmail = input.nextLine();
						i.email = editEmail;
					}
					System.out.println(persons);
				}

			}

			System.out.println("Deleting a contact");

			System.out.println(persons);
			System.out.println("Which contact you want to delete from address book: ");
			Scanner input = new Scanner(System.in);
			String deleteContact = input.next();

			for (AddressBookManagementDeleteUC4 i : persons) {

				if (i.getFirstName().equals(deleteContact)) {
					persons.remove(i);
				}
			}
			System.out.println(persons);

		} else {
			System.out.println("Invalid Option");
		}
	}
}
