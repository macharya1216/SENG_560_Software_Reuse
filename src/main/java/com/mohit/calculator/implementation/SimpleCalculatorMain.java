package com.mohit.calculator.implementation;

import java.util.Scanner;

import com.mohit.calculator.utility.ConversionUtil;

public class SimpleCalculatorMain {

	public static void main(String... args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println(ConversionUtil.prettyPrint(1));
			int operationChoice = input.nextInt();

			switch (operationChoice) {

			case 1:

				performCalculation(ConversionUtil.OPERATION_TYPE.get(1), input);

				break;

			case 2:
				performConversion(ConversionUtil.OPERATION_TYPE.get(2), input);
				break;

			default:
				System.out.println("Not a valid choice. Please try again!");
				main();

			}
		} catch (Exception e) {
			System.out.println("Invariants destroyed : System will restart");
			main();
		}

	}

	private static void performConversion(String string, Scanner input) {
		try {
			System.out.println(ConversionUtil.prettyPrint(4));
			int sourceBase = input.nextInt();

			System.out.println(ConversionUtil.prettyPrint(5));
			int targetBase = input.nextInt();

			if (sourceBase > 0 && sourceBase <= 4 && targetBase > 0
					&& targetBase <= 4) {

				performBaseConversion(ConversionUtil.BASE_TYPE.get(sourceBase),
						ConversionUtil.BASE_TYPE.get(targetBase), input);

			} else {
				System.out.println("Not a valid choice. Please try again!");
				performConversion(string, input);
			}
		} catch (Exception e) {
			System.out.println("Invariants destroyed : System will restart");
			main();
		}

	}

	private static void performBaseConversion(String sourceBase,
			String targetBase, Scanner input) {

		try {
			System.out.println("\n Enter Value 1 in " + sourceBase
					+ " format for conversion into " + targetBase);

			String val1 = String.valueOf(input.next());
			if (SimpleConverter.valueOf(sourceBase).isValid(val1)) {

				String answer = SimpleOperations.CONVERT.apply(null,
						SimpleConverter.valueOf(sourceBase),
						SimpleConverter.valueOf(targetBase), val1, null);

				if (answer != null)
					System.out.println("Final result for conversion from "
							+ sourceBase + " to " + targetBase + " is "
							+ answer);

				System.out.println("Try Again : Enter Y or N");

				String tryAgain = String.valueOf(input.next());

				if (tryAgain.equalsIgnoreCase("Y")) {
					main();
				} else {
					System.out.println("Good Bye !! System will exit!");
					System.exit(0);
				}

			} else {
				System.out.println(val1 + "is not a valid base type for "
						+ sourceBase);
				performBaseConversion(sourceBase, targetBase, input);
			}
		} catch (Exception e) {
			System.out.println("Invariants destroyed : System will restart");
			main();
		}

	}

	private static void performCalculation(String operation, Scanner input) {

		try {
			System.out.println(ConversionUtil.prettyPrint(2));
			int calculationChoice = input.nextInt();
			switch (calculationChoice) {

			case 1:
				performBaseCalculation(operation,
						ConversionUtil.CALCULATION_TYPE.get(calculationChoice),
						input);
				break;

			case 2:

				performBaseCalculation(operation,
						ConversionUtil.CALCULATION_TYPE.get(calculationChoice),
						input);
				break;

			case 3:

				performBaseCalculation(operation,
						ConversionUtil.CALCULATION_TYPE.get(calculationChoice),
						input);
				break;

			case 4:

				performBaseCalculation(operation,
						ConversionUtil.CALCULATION_TYPE.get(calculationChoice),
						input);
				break;

			case 5:

				performBaseCalculation(operation,
						ConversionUtil.CALCULATION_TYPE.get(calculationChoice),
						input);

				break;

			case 6:

				performBaseCalculation(operation,
						ConversionUtil.CALCULATION_TYPE.get(calculationChoice),
						input);
				break;

			default:
				System.out.println("Not a valid choice. Please try again!");
				performCalculation(operation, input);

			}
		} catch (Exception e) {
			System.out.println("Invariants destroyed : System will restart");
			main();
		}
	}

	private static void performBaseCalculation(String operation,
			String calculationType, Scanner input) {

		try {
			System.out.println(ConversionUtil.prettyPrint(3));
			int basechoice = input.nextInt();

			switch (basechoice) {

			case 1:
				finalCalculation(operation, calculationType,
						ConversionUtil.BASE_TYPE.get(basechoice), input);
				break;

			case 2:
				finalCalculation(operation, calculationType,
						ConversionUtil.BASE_TYPE.get(basechoice), input);
				break;

			case 3:
				finalCalculation(operation, calculationType,
						ConversionUtil.BASE_TYPE.get(basechoice), input);
				break;

			case 4:
				finalCalculation(operation, calculationType,
						ConversionUtil.BASE_TYPE.get(basechoice), input);
				break;

			default:
				System.out.println("Not a valid choice. Please try again!");
				performBaseCalculation(operation, calculationType, input);
			}
		} catch (Exception e) {
			System.out.println("Invariants destroyed : System will restart");
			main();
		}
	}

	private static void finalCalculation(String operation, String calculation,
			String base, Scanner input) {
		try {
			System.out.println("\n Enter Value 1 in " + base + " format for "
					+ calculation);
			String val1 = String.valueOf(input.next());
			String val2 = null;
			if (!calculation.equalsIgnoreCase("SQUARE_ROOT")) {
				System.out.println("\n Enter Value 2 in " + base
						+ " format for " + calculation);
				val2 = String.valueOf(input.next());
			}
			String result = null;

			if (!calculation.equalsIgnoreCase("EXPONENT")
					&& !calculation.equalsIgnoreCase("SQUARE_ROOT")) {

				if (SimpleConverter.valueOf(base).isValid(val1)
						&& SimpleConverter.valueOf(base).isValid(val2)) {

					try {
						result = SimpleOperations
								.valueOf(operation)
								.apply(SimpleCaseCalculator
										.valueOf(calculation),
										SimpleConverter.valueOf(base), null,
										val1, val2);
					} catch (Exception e) {
						System.out.println("Exception e" + e);
					}
				} else {
					System.out.println("The input value " + val1 + " and/or "
							+ val2 + " are not valid base of " + base);
					finalCalculation(operation, calculation, base, input);
				}

			} else if ((calculation.equalsIgnoreCase("EXPONENT") || calculation
					.equalsIgnoreCase("SQUARE_ROOT"))
					&& base.equalsIgnoreCase("INTEGER")) {

				if ((calculation.equalsIgnoreCase("SQUARE_ROOT") && SimpleConverter.INTEGER
						.isValid(val1))
						|| (calculation.equalsIgnoreCase("EXPONENT")
								&& SimpleConverter.INTEGER.isValid(val1) && SimpleConverter.INTEGER
									.isValid(val2))) {
					result = SimpleOperations.valueOf(operation).apply(
							SimpleCaseCalculator.valueOf(calculation),
							SimpleConverter.valueOf(base), null, val1, val2);
				} else {
					System.out.println("The input value " + val1 + " and/or "
							+ val2 + " are not valid base of " + base);
					finalCalculation(operation, calculation, base, input);
				}
			} else {
				System.out
						.println("EXPONENT and SQUARE ROOT functionality is not allowed for base "
								+ base);
				performBaseCalculation(operation, calculation, input);
			}
			if (result != null)
				System.out.println("Final result for " + operation
						+ " of calcuation type " + calculation
						+ " on the base of " + base + " between " + val1
						+ " and " + val2 + " is " + result);

			System.out.println("\n Try Again : Enter Y or N");

			String tryAgain = String.valueOf(input.next());

			if (tryAgain.equalsIgnoreCase("Y")) {
				main();
			} else {
				System.out.println("Good Bye !! System will exit!");
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println("Invariants destroyed : System will restart");
			main();
		}

	}

}
