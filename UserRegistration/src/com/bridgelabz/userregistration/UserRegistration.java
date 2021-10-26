package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

	public static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

	public static final String EMAIL_ADDRESS_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
	public static final String MOBILE_NUMBER_PATTERN = "(0/91)?( )[7-9][0-9]{9}";

	public static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";

	FirstNameValidator firstNameValidator = (firstName) -> {
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		return pattern.matcher(firstName).matches();
	};

	LastNameValidator lastNameValidator = (lastName) -> {
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		return pattern.matcher(lastName).matches();
	};

	EmailValidator emailValidator = (email) -> {
		Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(email).matches();
	};

	MobileValidator mobileValidator = (mobileNumber) -> {
		Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
		return pattern.matcher(mobileNumber).find();
	};

	PasswordValidator passwordValidator = (password) -> {
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		return pattern.matcher(password).matches();
	};

}
