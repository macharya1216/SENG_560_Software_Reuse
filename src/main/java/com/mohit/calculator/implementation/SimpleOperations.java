package com.mohit.calculator.implementation;

import com.mohit.calculator.abstraction.Operation;

public enum SimpleOperations implements Operation {

	CALCULATE {

		@Override
		public String apply(SimpleCaseCalculator operation,
				SimpleConverter conversion, SimpleConverter convertTo,String value1, String value2) {

			String value = null;
			switch (conversion) {

			case BINARY:

				switch (operation) {

				case ADD:
					value = SimpleConverter.BINARY.convert(
							SimpleConverter.INTEGER,
							SimpleCaseCalculator.ADD.calculate(Double
									.parseDouble(SimpleConverter.INTEGER
											.convert(SimpleConverter.BINARY,
													value1)), Double
									.parseDouble(SimpleConverter.INTEGER
											.convert(SimpleConverter.BINARY,
													value2))));
					break;

				case SUBSTRACT:

					value = SimpleConverter.BINARY.convert(
							SimpleConverter.INTEGER,
							SimpleCaseCalculator.SUBSTRACT.calculate(Double
									.parseDouble(SimpleConverter.INTEGER
											.convert(SimpleConverter.BINARY,
													value1)), Double
									.parseDouble(SimpleConverter.INTEGER
											.convert(SimpleConverter.BINARY,
													value2))));

					break;

				case MULTIPLY:

					value = SimpleConverter.BINARY.convert(
							SimpleConverter.INTEGER,
							SimpleCaseCalculator.MULTIPLY.calculate(Double
									.parseDouble(SimpleConverter.INTEGER
											.convert(SimpleConverter.BINARY,
													value1)), Double
									.parseDouble(SimpleConverter.INTEGER
											.convert(SimpleConverter.BINARY,
													value2))));

					break;

				case DIVIDE:

					value = SimpleConverter.BINARY.convert(
							SimpleConverter.INTEGER,
							SimpleCaseCalculator.DIVIDE.calculate(Double
									.parseDouble(SimpleConverter.INTEGER
											.convert(SimpleConverter.BINARY,
													value1)), Double
									.parseDouble(SimpleConverter.INTEGER
											.convert(SimpleConverter.BINARY,
													value2))));

					break;
				}
				break;
			case INTEGER:

				switch (operation) {

				case ADD:
					value = String.valueOf(SimpleCaseCalculator.ADD.calculate(
							Double.parseDouble(value1),
							Double.parseDouble(value2)));
					break;
				case SUBSTRACT:
					value = String.valueOf(SimpleCaseCalculator.SUBSTRACT
							.calculate(Double.parseDouble(value1),
									Double.parseDouble(value2)));
					break;
				case MULTIPLY:
					value = String.valueOf(SimpleCaseCalculator.MULTIPLY
							.calculate(Double.parseDouble(value1),
									Double.parseDouble(value2)));
					break;
				case DIVIDE:
					value = String.valueOf(SimpleCaseCalculator.DIVIDE
							.calculate(Double.parseDouble(value1),
									Double.parseDouble(value2)));
					break;
				case EXPONENT:
					value = String.valueOf(SimpleCaseCalculator.EXPONENT
							.calculate(Double.parseDouble(value1),
									Double.parseDouble(value2)));
					break;
				case SQUARE_ROOT:
					value = String.valueOf(SimpleCaseCalculator.SQUARE_ROOT
							.calculate(Double.parseDouble(value1),
									0));
					break;
				}

				break;

			case HEXADECIMAL:

				switch (operation) {

				case ADD:
					value = SimpleConverter.HEXADECIMAL
							.convert(
									SimpleConverter.INTEGER,
									SimpleCaseCalculator.ADD.calculate(
											Double.parseDouble(SimpleConverter.INTEGER
													.convert(
															SimpleConverter.HEXADECIMAL,
															value1)),
											Double.parseDouble(SimpleConverter.INTEGER
													.convert(
															SimpleConverter.HEXADECIMAL,
															value2))));
					break;

				case SUBSTRACT:

					value = SimpleConverter.HEXADECIMAL
							.convert(
									SimpleConverter.INTEGER,
									SimpleCaseCalculator.SUBSTRACT.calculate(
											Double.parseDouble(SimpleConverter.INTEGER
													.convert(
															SimpleConverter.HEXADECIMAL,
															value1)),
											Double.parseDouble(SimpleConverter.INTEGER
													.convert(
															SimpleConverter.HEXADECIMAL,
															value2))));
					break;

				case MULTIPLY:

					value = SimpleConverter.HEXADECIMAL
							.convert(
									SimpleConverter.INTEGER,
									SimpleCaseCalculator.MULTIPLY.calculate(
											Double.parseDouble(SimpleConverter.INTEGER
													.convert(
															SimpleConverter.HEXADECIMAL,
															value1)),
											Double.parseDouble(SimpleConverter.INTEGER
													.convert(
															SimpleConverter.HEXADECIMAL,
															value2))));
					break;

				case DIVIDE:

					value = SimpleConverter.HEXADECIMAL
							.convert(
									SimpleConverter.INTEGER,
									SimpleCaseCalculator.DIVIDE.calculate(
											Double.parseDouble(SimpleConverter.INTEGER
													.convert(
															SimpleConverter.HEXADECIMAL,
															value1)),
											Double.parseDouble(SimpleConverter.INTEGER
													.convert(
															SimpleConverter.HEXADECIMAL,
															value2))));

					break;
				}
				
				break;
			case OCTAL:

				switch (operation) {

				case ADD:
					value = SimpleConverter.OCTAL.convert(
							SimpleConverter.INTEGER,
							SimpleCaseCalculator.ADD.calculate(Double
									.parseDouble(SimpleConverter.INTEGER
											.convert(SimpleConverter.OCTAL,
													value1)), Double
									.parseDouble(SimpleConverter.INTEGER
											.convert(SimpleConverter.OCTAL,
													value2))));
					break;

				case SUBSTRACT:

					value = SimpleConverter.OCTAL.convert(
							SimpleConverter.INTEGER,
							SimpleCaseCalculator.SUBSTRACT.calculate(Double
									.parseDouble(SimpleConverter.INTEGER
											.convert(SimpleConverter.OCTAL,
													value1)), Double
									.parseDouble(SimpleConverter.INTEGER
											.convert(SimpleConverter.OCTAL,
													value2))));
					break;

				case MULTIPLY:

					value = SimpleConverter.OCTAL.convert(
							SimpleConverter.INTEGER,
							SimpleCaseCalculator.MULTIPLY.calculate(Double
									.parseDouble(SimpleConverter.INTEGER
											.convert(SimpleConverter.OCTAL,
													value1)), Double
									.parseDouble(SimpleConverter.INTEGER
											.convert(SimpleConverter.OCTAL,
													value2))));
					break;

				case DIVIDE:

					value = SimpleConverter.OCTAL.convert(
							SimpleConverter.INTEGER,
							SimpleCaseCalculator.DIVIDE.calculate(Double
									.parseDouble(SimpleConverter.INTEGER
											.convert(SimpleConverter.OCTAL,
													value1)), Double
									.parseDouble(SimpleConverter.INTEGER
											.convert(SimpleConverter.OCTAL,
													value2))));

					break;
				}

				break;

			}
			return value;

		}

	},

	CONVERT {

		@Override
		public String apply(SimpleCaseCalculator operation,
				SimpleConverter convertFrom, SimpleConverter convertTo,
				String value1, String value2) {

			switch (convertFrom) {

			case INTEGER:
				return convertTo.convert(convertFrom, Double.valueOf(value1));
			default:
				return convertTo.convert(convertFrom, value1);

			}

		}

	};
}
