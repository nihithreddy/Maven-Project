/**
 * 
 */
package com.epam.assignment;

/**
 * @author Nihith
 *
 */
public class SimpleInterest {
	public int calculateSimpleInterest(int principle, int rate, int time) {
		float simple_interest = (principle * rate * time) / 100;
		return (int)simple_interest;
	}
}
