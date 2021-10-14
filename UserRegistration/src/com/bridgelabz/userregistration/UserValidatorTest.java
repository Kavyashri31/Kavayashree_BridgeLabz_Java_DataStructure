package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserValidatorTest {

	@Test
	void givenFirstNameWhenProperShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateFirstName("Kavya");
		Assert.assertEquals(true, result);

	}

	@Test
	void givenFirstNameWhenShortShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateFirstName("Ka");
		Assert.assertEquals(false, result);

	}

	@Test
	void givenFirstNameWithSpecialCharactersShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateFirstName("K@vya");
		Assert.assertEquals(false, result);

	}

	@Test
	void givenLastNameWhenProperShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateLastName("Kavya");
		Assert.assertEquals(true, result);

	}

	@Test
	void givenLastNameWhenShortShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateLastName("Ka");
		Assert.assertEquals(false, result);

	}

	@Test
	void givenLastNameWithSpecialCharactersShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateLastName("K@vya");
		Assert.assertEquals(false, result);

	}

	@Test
	void givenEmailWhenValidShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateEmail("kavya@gmail.com");
		Assert.assertEquals(true, result);

	}

	@Test
	void givenEmailWhenInValidShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateEmail("kavyaAtGmail.com");
		Assert.assertEquals(false, result);

	}

	@Test
	void givenMobileWhenValidShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validatMobileNumber("91 7234567899");
		Assert.assertEquals(true, result);

	}

	@Test
	void givenMobileWhenInValidShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validatMobileNumber("91 123");
		Assert.assertEquals(false, result);

	}

	@Test
	void givenPasswordWhenValidShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validatePassword("P@sW0rd1");
		Assert.assertEquals(true, result);

	}

	@Test
	void givenPasswordWhenInValidShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validatePassword("pass");
		Assert.assertEquals(false, result);

	}

}
