package com.ketul.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { PasswordValidator.class })
public @interface PasswordAnnotation {

	String message() default "Your Password is not good";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
