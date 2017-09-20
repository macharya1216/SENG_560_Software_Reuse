package com.mohit.calculator.implementation;

import java.math.BigInteger;

import com.mohit.calculator.abstraction.Converter;
import com.mohit.calculator.utility.ConversionUtil;

//TODO Make this generic
public enum SimpleConverter implements Converter<Object> {

	BINARY {

		@Override
		public String convert(SimpleConverter conv, Object source) {
			String val = null;
			switch (conv) {

			case BINARY:
				val = (String) source;
				break;
			case INTEGER:
				val = source instanceof Double ? Integer
						.toBinaryString(ConversionUtil.returnDouble(source))
						: Integer.toBinaryString((Integer) source);
				break;
			case HEXADECIMAL:
				val = new BigInteger((String) source, 16).toString(2);
				break;

			case OCTAL:
				val = new BigInteger((String) source, 8).toString(2);
				break;

			}
			return val;
		}

		@Override
		public boolean isValid(String val1) {
			return val1.matches("[01]+");
		}

	},

	INTEGER {
		public String convert(SimpleConverter conv, Object source) {

			String val = null;
			switch (conv) {

			case BINARY:
				val = String.valueOf(Integer.parseInt((String) source, 2));
				break;
			case INTEGER:
				val = source instanceof Double ? String
						.valueOf((Double) source) : String
						.valueOf((Integer) source);

				break;
			case HEXADECIMAL:
				val = String.valueOf(Integer.parseInt((String) source, 16));
				break;

			case OCTAL:
				val = String.valueOf(Integer.parseInt((String) source, 8));
				break;

			}
			return val;

		}

		@Override
		public boolean isValid(String val1) {
			return val1.matches("-?\\d+(\\.\\d+)?");
		}
	},
	HEXADECIMAL {
		public String convert(SimpleConverter conv, Object source) {

			String val = null;
			switch (conv) {

			case BINARY:
				val = Integer
						.toString(Integer.parseInt((String) source, 2), 16);
				break;
			case INTEGER:
				val = source instanceof Double ? Integer.toString(
						ConversionUtil.returnDouble(source).intValue(), 16)
						: Integer.toString((Integer) source, 16);

				break;
			case HEXADECIMAL:
				val = ((String) source);
				break;

			case OCTAL:
				val = Integer
						.toString(Integer.parseInt((String) source, 8), 16);
				break;

			}
			return val;

		}

		@Override
		public boolean isValid(String val1) {
			return val1.matches("-?[0-9a-fA-F]+");
		}
	},
	OCTAL {
		public String convert(SimpleConverter conv, Object source) {

			String val = null;
			switch (conv) {

			case BINARY:
				val = Integer.toString(Integer.parseInt((String) source, 2), 8);
				break;
			case INTEGER:
				val = source instanceof Double ? Integer.toString(
						ConversionUtil.returnDouble(source).intValue(), 8)
						: Integer.toString((Integer) source, 8);

				break;
			case HEXADECIMAL:
				val = Integer
						.toString(Integer.parseInt((String) source, 16), 8);
				break;

			case OCTAL:
				val = ((String) source);
				break;

			}
			return val;

		}

		@Override
		public boolean isValid(String val1) {
			return val1.matches("-?[0-7]+");
		}
	};
}
