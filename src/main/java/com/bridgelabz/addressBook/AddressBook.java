package com.bridgelabz.addressBook;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Contact {

	String FirstName;
	String LastName;
	String Address;
	String City;
	String State;
	String PhoneNO;
	String Email;
	int ZipCode;

	// Contact[] contacts;

//	public Contact(String firstName, String address, String city, String state, String phoneNO, int zipCode,
//			String email) {
//		super();
//		FirstName = firstName;
//		Address = address;
//		City = city;
//		State = state;
//		PhoneNO = phoneNO;
//		ZipCode = zipCode;
//		Email = email;
//	}

	public String toString() {
		return "First Name: " + FirstName + " LastName " + LastName + " Address." + Address;
	}

//	void showContacts() {
//		System.out.println("FirstName : " + FirstName + "\nAddress: " + Address + " \nEmail : " + Email);
//		//System.out.println("Contacts are " + contacts);
//	}

	public String getFirstName() {
		return FirstName;
	}

	String updateContact(String FirstName) {
		//allContacts.put(contact.getFirstName(), contact);
		return FirstName;
	}

	void contactDetails() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the FirstName");
		FirstName = sc.nextLine();

		System.out.println("Enter the LastName");
		LastName = sc.nextLine();
		System.out.println("Enter the Address");
		Address = sc.nextLine();
		System.out.println("Enter the City");
		City = sc.nextLine();
		System.out.println("Enter the State");
		State = sc.nextLine();
		System.out.println("Enter the Phone NO");
		PhoneNO = sc.nextLine();
		System.out.println("Enter the Email");
		Email = sc.nextLine();
		System.out.println("Enter the ZipCode");
		ZipCode = sc.nextInt();

	}
}

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");

		Map<String, Contact> allContacts = new HashMap<String, Contact>();

		// Add Contact using Constructor
		// Contact contact= new
		// Contact("Ashish","Burlington","Lucknow","UP","9044855917",226001,"aashish7322@gmail.com");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of contacts you want to create");
		int noOfContact = sc.nextInt();

		for (int i = 1; i <= noOfContact; i++) {
			Contact contact = new Contact();
			contact.contactDetails();
			allContacts.put(contact.getFirstName(), contact);
		}

		allContacts.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
		System.out.println(allContacts);
		
		

	}
	
}