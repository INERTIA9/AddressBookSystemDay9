package com.addresBooksystembl.www;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class UserInterface {
	private static List<Persons> AddressDiary = new ArrayList();

	public static List<Persons> getAddressDiary() {
		return AddressDiary;
	}

	public void setAddressDiary(List<Persons> addressDiary) {
		AddressDiary = addressDiary;
	}

	public static void main(String[] arg) {
		System.out.println("Welcom To AddressBookSystem Programe");
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add Contact");
		System.out.println("2.Delete Contact");
		System.out.println("3.Display ContactBook");
		System.out.println("4.Edit Contactbook");

		while (true) {
			System.out.print("Enter Your Choice: ");

			int choice = Integer.parseInt(sc.nextLine());

			if (choice == 1) {
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Address: ");
				String address = sc.nextLine();
				System.out.print("Enter Phone Number: ");
				String phoneNumber = sc.nextLine();
				System.out.print("Enter LastName: ");
				String lastName = sc.nextLine();
				System.out.print("Enter City: ");
				String city = sc.nextLine();
				System.out.print("Enter State: ");
				String state = sc.nextLine();
				System.out.print("Enter ZipCode: ");
				String zipcode = sc.nextLine();
				Persons p = new Persons(name, address, phoneNumber, lastName, state, zipcode, city);
				AddressDiary.add(p);
				System.out.println("Contact added succesfully");
			} else if (choice == 2) {
				System.out.print("Enter Name Of Contact You Want To Delete: ");
				String inputName = sc.nextLine();

				for (Persons p : AddressDiary) {
					System.out.println("Enter the index at which person contact to be removed:");
					int index = Integer.parseInt(sc.nextLine());
					AddressDiary.remove(index);
				}
			} else if (choice == 3) {
				getAddressDiary();
				System.out.println(getAddressDiary());
			} else if (choice == 4) {
				System.out.println("Enter the name you want to edit: ");
				String name = sc.nextLine();

				for (Persons value : AddressDiary) {
					if (Objects.equals(name, value.name)) {
						System.out.println("Enter the first name : ");
						String name1 = sc.nextLine();
						value.setName(name1);
						System.out.println("Enter the last name : ");
						String lastname1 = sc.nextLine();
						value.setLastName(lastname1);
						System.out.println("Enter the address name : ");
						String address1 = sc.nextLine();
						value.setAddress(address1);
						System.out.println("Enter the city name : ");
						String city1 = sc.nextLine();
						value.setCity(city1);
						System.out.println("Enter the state name : ");
						String state1 = sc.nextLine();
						value.setState(state1);
						System.out.println("Enter the zipcode: ");
						String zipcode1 = sc.nextLine();
						value.setZipCode(zipcode1);
						System.out.println("Enter the new number: ");
						String number1 = sc.nextLine();
						value.setPhoneNumber(number1);
						System.out.println("Details updated Succesfully");
					}
				}
			} else {
				System.out.println("Invalid Choice!Try again");
			}
		}
	}
}