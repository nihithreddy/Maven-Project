/**
 * 
 */
package com.epam.assignment;

/**
 * @author Nihith
 *
 */
public class Calculator {
public int add(int number1,int number2) {
	int sum=number1+number2;
	return sum;
}
public int multiply(int number1,int number2) {
	int result=number1*number2;
	return result;
}
public int divide(int number1,int number2) {
	int ans=0;
	try {
		ans=number1/number2;
	}
	catch(ArithmeticException e) {
	}
	return ans;
}
}
