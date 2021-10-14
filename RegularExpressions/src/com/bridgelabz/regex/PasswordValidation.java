package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter password:");
		String password = scan.next();

		Pattern REGEX = Pattern.compile(PASSWORD_PATTERN, Pattern.CASE_INSENSITIVE);
		Matcher matcher = REGEX.matcher(password);
		boolean isValid = matcher.find();
		if (isValid)
			System.out.println(password + " is a valid password.");
		else
			System.out.println(password + " is NOT a valid password.");

	}

}
