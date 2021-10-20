package com.bridgelabz.regex;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RegularExpressionValidationTest {

	@Test
	void givenFirstNameWhenProperShouldReturnTrue() {
		RegularExpressionValidation validator = new RegularExpressionValidation();
		boolean result = validator.validateFirstName("Kavya");
		Assert.assertEquals(true, result);

	}

	@Test
	void givenFirstNameWhenShortShouldReturnFalse() {
		RegularExpressionValidation validator = new RegularExpressionValidation();
		boolean result = validator.validateFirstName("Ka");
		Assert.assertEquals(false, result);

	}

	@Test
	void givenFirstNameWithSpecialCharactersShouldReturnFalse() {
		RegularExpressionValidation validator = new RegularExpressionValidation();
		boolean result = validator.validateFirstName("K@vya");
		Assert.assertEquals(false, result);

	}

	@Test
	void givenLastNameWhenProperShouldReturnTrue() {
		RegularExpressionValidation validator = new RegularExpressionValidation();
		boolean result = validator.validateLastName("Kavya");
		Assert.assertEquals(true, result);

	}

	@Test
	void givenLastNameWhenShortShouldReturnFalse() {
		RegularExpressionValidation validator = new RegularExpressionValidation();
		boolean result = validator.validateLastName("Ka");
		Assert.assertEquals(false, result);

	}

	@Test
	void givenLastNameWithSpecialCharactersShouldReturnFalse() {
		RegularExpressionValidation validator = new RegularExpressionValidation();
		boolean result = validator.validateLastName("K@vya");
		Assert.assertEquals(false, result);

	}

	@Test
	void givenEmailWhenValidShouldReturnTrue() {
		RegularExpressionValidation validator = new RegularExpressionValidation();
		boolean result = validator.validateEmail("kavya@gmail.com");
		Assert.assertEquals(true, result);

	}

	@Test
	void givenEmailWhenInValidShouldReturnFalse() {
		RegularExpressionValidation validator = new RegularExpressionValidation();
		boolean result = validator.validateEmail("kavyaAtGmail.com");
		Assert.assertEquals(false, result);

	}

	@Test
	void givenMobileWhenValidShouldReturnTrue() {
		RegularExpressionValidation validator = new RegularExpressionValidation();
		boolean result = validator.validatMobileNumber("91 7234567899");
		Assert.assertEquals(true, result);

	}

	@Test
	void givenMobileWhenInValidShouldReturnFalse() {
		RegularExpressionValidation validator = new RegularExpressionValidation();
		boolean result = validator.validatMobileNumber("91 123");
		Assert.assertEquals(false, result);

	}

	@Test
	void givenPasswordWhenValidShouldReturnTrue() {
		RegularExpressionValidation validator = new RegularExpressionValidation();
		boolean result = validator.validatePassword("P@sW0rd1");
		Assert.assertEquals(true, result);

	}

	@Test
	void givenPasswordWhenInValidShouldReturnFalse() {
		RegularExpressionValidation validator = new RegularExpressionValidation();
		boolean result = validator.validatePassword("pass");
		Assert.assertEquals(false, result);

	}

}
