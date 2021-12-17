package com.ketul.annotation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<PasswordAnnotation, String> {

	List<String> passList = Arrays.asList("123456789",
			"987654321", null);
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		System.out.println(value);
		return !passList.contains(value);
	}

}
