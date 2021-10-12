package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LastNameValidation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter last name:");
		String lastName = scan.next();

		boolean matchFound = Pattern.matches("[A-Z][a-zA-Z]{2,}", lastName);

		if (matchFound) {
			System.out.println("Last Name Validation successful. " + lastName + " is  valid");
		} else {
			System.out.println("Last name should start with Cap and should have minimum 3 characters");
		}

	}

}
