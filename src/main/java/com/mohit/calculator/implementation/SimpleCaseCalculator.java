package com.mohit.calculator.implementation;

import com.mohit.calculator.abstraction.Calculator;

public enum SimpleCaseCalculator implements Calculator {

	ADD {
		public double calculate(double val1, double val2) {
			return val1 + val2;
		}

	},
	SUBSTRACT {
		public double calculate(double val1, double val2) {
			return val1 - val2;
		}

	},
	MULTIPLY {
		public double calculate(double val1, double val2) {
			return val1 * val2;
		}

	},
	DIVIDE {
		public double calculate(double val1, double val2) {
			return val1 / val2;
		}

	},
	EXPONENT {
		public double calculate(double val1, double val2) {
			return Math.pow(val1, val2);
		}

	},
	SQUARE_ROOT {
		public double calculate(double val1, double val2) {
			return Math.sqrt(val1);
		}

	};

}
