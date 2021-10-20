package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter email:");
		String email = scan.next();
		scan.close();
		Pattern REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = REGEX.matcher(email);
		boolean isValid = matcher.find();
		if (isValid)
			System.out.println(email + " is a valid email id.");
		else
			System.out.println(email + " is NOT valid email id.");

	}

}
