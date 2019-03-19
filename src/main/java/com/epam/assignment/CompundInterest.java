/**
 * 
 */
package com.epam.assignment;

/**
 * @author Nihith
 *
 */
public class CompundInterest {
	public int calculateCompoundInterest(int principle,int ratio,int time,int n) {
		double compound_interest=0;
		compound_interest=principle*Math.pow((1+(ratio/time)),n*time);
		return (int)compound_interest;
	}
}
