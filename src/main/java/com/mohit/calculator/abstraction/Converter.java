package com.mohit.calculator.abstraction;

import com.mohit.calculator.implementation.SimpleConverter;

public interface Converter<S> {
	String convert(SimpleConverter conv, S source );
	boolean isValid(String val1);
}
