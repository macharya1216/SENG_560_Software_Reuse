package com.mohit.calculator.utility;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ConversionUtil {

	public static Integer returnDouble(Object val) {
		Double db = (Double) val;
		return db.intValue();
	}

	public static final Map<Integer, String> BASE_TYPE = Collections
			.unmodifiableMap(new HashMap<Integer, String>() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				{
					put(1, "BINARY");
					put(2, "INTEGER");
					put(3, "HEXADECIMAL");
					put(4, "OCTAL");
				}
			});

	public static final Map<Integer, String> OPERATION_TYPE = Collections
			.unmodifiableMap(new HashMap<Integer, String>() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				{
					put(1, "CALCULATE");
					put(2, "CONVERT");
				}
			});

	public static final Map<Integer, String> CALCULATION_TYPE = Collections
			.unmodifiableMap(new HashMap<Integer, String>() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				{
					put(1, "ADD");
					put(2, "SUBSTRACT");
					put(3, "MULTIPLY");
					put(4, "DIVIDE");
					put(5, "EXPONENT");
					put(6, "SQUARE_ROOT");
				}
			});

	public static String prettyPrint(int type) {

		final StringBuilder sb = new StringBuilder();

		switch (type) {

		case 1:
			sb.append("\nPlease select the type of OPERATION \n");
			sb.append("----------------------------\n");
			sb.append("Press 1 for : CALCUATION \n");
			sb.append("Press 2 for : CONVERSION \n");
			sb.append("----------------------------\n");
			break;

		case 2:
			sb.append("\nPlease select the type of CALCUATION \n");
			sb.append("----------------------------\n");
			sb.append("Press 1 for : ADD \n");
			sb.append("Press 2 for : SUBSTRACT \n");
			sb.append("Press 3 for : MULTIPLY \n");
			sb.append("Press 4 for : DIVIDE \n");
			sb.append("Press 5 for : EXPONENT \n");
			sb.append("Press 6 for : SQUARE_ROOT \n");
			sb.append("----------------------------\n");
			break;
			
		case 3:
			sb.append("\nPlease select the type of BASE \n");
			sb.append("----------------------------\n");
			sb.append("Press 1 for : BINARY \n");
			sb.append("Press 2 for : INTEGER \n");
			sb.append("Press 3 for : HEXADECIMAL \n");
			sb.append("Press 4 for : OCTAL \n");
			sb.append("----------------------------\n");
			break;	
			
		case 4:
			sb.append("\nPlease select the type of ORIGINAL BASE (Source)  \n");
			sb.append("----------------------------\n");
			sb.append("Press 1 for : BINARY \n");
			sb.append("Press 2 for : INTEGER \n");
			sb.append("Press 3 for : HEXADECIMAL \n");
			sb.append("Press 4 for : OCTAL \n");
			sb.append("----------------------------\n");
			break;
			
		case 5:
			sb.append("\nPlease select the type of CONVERTED BASE (Target)  \n");
			sb.append("----------------------------\n");
			sb.append("Press 1 for : BINARY \n");
			sb.append("Press 2 for : INTEGER \n");
			sb.append("Press 3 for : HEXADECIMAL \n");
			sb.append("Press 4 for : OCTAL \n");
			sb.append("----------------------------\n");
			break;
			
		}
		return sb.toString();

	}


}
