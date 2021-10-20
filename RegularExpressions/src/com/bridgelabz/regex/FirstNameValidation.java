package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FirstNameValidation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first name:");
		String firstName = scan.next();
		scan.close();

		boolean matchFound = Pattern.matches("[A-Z][a-zA-Z]{2,}", firstName);

		if (matchFound) {
			System.out.println("First Name Validation successful. " + firstName + " is  valid");
		} else {
			System.out.println("First name should start with Cap and should have minimum 3 characters");
		}

	}

}
