package com.mohit.calculator.implementation;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.mohit.calculator.abstraction.Calculator;

public class SimpleCaseCalculatorTest {

	@Test
	public void testAddition() {

		Calculator cal = SimpleCaseCalculator.valueOf("ADD");
		assertNotNull(cal.calculate(10, 0.001));
	}

	@Test
	public void testSubstraction() {

		assertNotNull(SimpleCaseCalculator.valueOf("SUBSTRACT").calculate(10,
				0.001));
	}

	@Test
	public void testMultiply() {

		assertNotNull(SimpleCaseCalculator.valueOf("MULTIPLY").calculate(10,
				0.001));
	}

	@Test
	public void testDivide() {

		assertNotNull(SimpleCaseCalculator.valueOf("DIVIDE").calculate(10,
				0.001));
	}

	@Test
	public void testExponent() {

		assertNotNull(SimpleCaseCalculator.valueOf("EXPONENT").calculate(10,
				0.001));
	}

	@Test
	public void testSquareRoot() {

		assertNotNull(SimpleCaseCalculator.valueOf("SQUARE_ROOT").calculate(10,
				0.001));
	}

	@Test
	public void testToBinary() {

		assertNotNull(SimpleConverter.BINARY.convert(SimpleConverter.BINARY,
				"101"));
	}

	@Test
	public void testIntegerToBinary() {

		assertNotNull(SimpleConverter.BINARY.convert(SimpleConverter.INTEGER,
				101));
	}

	@Test
	public void testDecimalToBinary() {

		assertNotNull(SimpleConverter.BINARY.convert(SimpleConverter.INTEGER,
				101.1));
	}

	@Test
	public void testHexaToBinary() {

		assertNotNull(SimpleConverter.BINARY.convert(
				SimpleConverter.HEXADECIMAL, "FF"));
	}

	@Test
	public void testOctalToBinary() {

		assertNotNull(SimpleConverter.BINARY
				.convert(SimpleConverter.OCTAL, "7"));
	}

	@Test
	public void testBinaryToInteger() {

		assertNotNull(SimpleConverter.INTEGER.convert(SimpleConverter.BINARY,
				"101"));
	}

	@Test
	public void testToInteger() {

		assertNotNull(SimpleConverter.INTEGER.convert(SimpleConverter.INTEGER,
				101));
	}

	@Test
	public void testHexaToInteger() {

		assertNotNull(SimpleConverter.INTEGER.convert(
				SimpleConverter.HEXADECIMAL, "FF"));
	}

	@Test
	public void testOctalToInteger() {

		assertNotNull(SimpleConverter.INTEGER.convert(SimpleConverter.OCTAL,
				"7"));
	}

	@Test
	public void testBinaryToHexa() {

		assertNotNull(SimpleConverter.HEXADECIMAL.convert(
				SimpleConverter.BINARY, "101"));
	}

	@Test
	public void testIntegerToHexa() {

		assertNotNull(SimpleConverter.HEXADECIMAL.convert(
				SimpleConverter.INTEGER, 101.11));
	}

	@Test
	public void testToHexa() {

		assertNotNull(SimpleConverter.HEXADECIMAL.convert(
				SimpleConverter.HEXADECIMAL, "FF"));
	}

	@Test
	public void testOctalToHexa() {

		assertNotNull(SimpleConverter.HEXADECIMAL.convert(
				SimpleConverter.OCTAL, "7"));
	}

	@Test
	public void testBinaryToOctal() {

		assertNotNull(SimpleConverter.OCTAL.convert(SimpleConverter.BINARY,
				"101"));
	}

	@Test
	public void testToOctal() {

		assertNotNull(SimpleConverter.OCTAL.convert(SimpleConverter.INTEGER,
				101));
	}

	@Test
	public void testHexaToOctal() {

		assertNotNull(SimpleConverter.OCTAL.convert(
				SimpleConverter.HEXADECIMAL, "FF"));
	}

	@Test
	public void testHexaAddition() {

		assertNotNull(SimpleConverter.HEXADECIMAL.convert(
				SimpleConverter.INTEGER, SimpleCaseCalculator.ADD.calculate(
						Double.parseDouble(SimpleConverter.INTEGER.convert(
								SimpleConverter.HEXADECIMAL, "FF")), Double
								.parseDouble(SimpleConverter.INTEGER.convert(
										SimpleConverter.HEXADECIMAL, "FF")))));
	}

	@Test
	public void testHexaMultiplication() {

		assertNotNull(SimpleConverter.HEXADECIMAL.convert(
				SimpleConverter.INTEGER, SimpleCaseCalculator.DIVIDE.calculate(
						Double.parseDouble(SimpleConverter.INTEGER.convert(
								SimpleConverter.HEXADECIMAL, "FF")), Double
								.parseDouble(SimpleConverter.INTEGER.convert(
										SimpleConverter.HEXADECIMAL, "FF")))));
	}

	@Test
	public void testBinaryAddition() {

		assertNotNull(SimpleConverter.BINARY.convert(SimpleConverter.INTEGER,
				SimpleCaseCalculator.ADD.calculate(Double
						.parseDouble(SimpleConverter.INTEGER.convert(
								SimpleConverter.BINARY, "1101")), Double
						.parseDouble(SimpleConverter.INTEGER.convert(
								SimpleConverter.BINARY, "1100")))));
	}

	@Test
	public void testBinarySubstraction() {

		assertNotNull(SimpleConverter.BINARY.convert(SimpleConverter.INTEGER,
				SimpleCaseCalculator.SUBSTRACT.calculate(Double
						.parseDouble(SimpleConverter.INTEGER.convert(
								SimpleConverter.BINARY, "1101")), Double
						.parseDouble(SimpleConverter.INTEGER.convert(
								SimpleConverter.BINARY, "1100")))));
	}

	@Test
	public void testOctalMultiplication() {

		assertNotNull(SimpleConverter.OCTAL.convert(SimpleConverter.INTEGER,
				SimpleCaseCalculator.MULTIPLY.calculate(Double
						.parseDouble(SimpleConverter.INTEGER.convert(
								SimpleConverter.OCTAL, "7")), Double
						.parseDouble(SimpleConverter.INTEGER.convert(
								SimpleConverter.OCTAL, "7")))));
	}

}
