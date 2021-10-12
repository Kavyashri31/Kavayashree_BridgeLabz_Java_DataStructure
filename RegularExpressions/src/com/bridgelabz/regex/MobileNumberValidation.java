package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter mobile number:");
		String mobile = "91 7234567899";// scan.next();

		System.out.println(mobile);
		Pattern pattern = Pattern.compile("(0/91)?( )[7-9][0-9]{9}");
		Matcher match = pattern.matcher(mobile);

		if (match.find()) {
			System.out.println("Mobile number: " + mobile + " is  valid");
		} else {
			System.out.println("Mobile number: " + mobile + " is  NOT valid");
		}

	}
}
