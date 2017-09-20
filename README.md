This is a class project for SENG 560 : Assignment two and the requirements were to build a basic calculator with minimum functionality with the support for 
BINARY , DECIMAL , HEXA and OCTAL. The source files are written in Java. 

How to use this library  : 

There are two ways you can use this library 

1) Using an Integrated Development Environment 

	 a) Download the package to your IDE (I'm using Eclipse) . Import as an existing Java project . Right click the project in Eclipse and go 
	 to Build Path -> Configure Build Path and make sure in the Sources tab /src/main/java , src/test/java are appearing. 
	 b) Navigate to SimpleCalculatorMain.java file right click the file and click Run As -> Java Application . 
	 
2) If you dont have an IDE you can just download the BasicCalc.jar file from src/main/resources folder and (you need to make sure you have 
JDK installed in your system) from the location where you have downloaded the JAR file , run the following command : 

java -cp BasicCalc.jar com.mohit.calculator.implementation.SimpleCalculatorMain	
 
 
The SENG560_Basic_Calculator constructs a set of reusable libraries for basic arithmetic functions. The program performs operations on integers
and floating point as well as numbers provided in octal, binary and hexadecimal . The Abstraction package has the main interfaces which 
promote the reusability aspect of this project. The Implementation package consists of most of the ground work. Also please check out the 
src/test/java to familiarize yourself with the heavy ENUM usage for all of the calculations. 