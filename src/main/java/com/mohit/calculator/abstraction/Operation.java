package com.mohit.calculator.abstraction;

import com.mohit.calculator.implementation.SimpleCaseCalculator;
import com.mohit.calculator.implementation.SimpleConverter;

public interface Operation {

	String apply(SimpleCaseCalculator calcluation, SimpleConverter convertFrom ,SimpleConverter convertTo,
			String value1, String value2);
}
