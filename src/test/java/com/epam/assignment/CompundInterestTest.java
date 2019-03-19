/**
 * 
 */
package com.epam.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Nihith
 *
 */
public class CompundInterestTest {

	@Test
	public void test() {
		CompundInterest ci=new CompundInterest();
		assertEquals(100,ci.calculateCompoundInterest(100,2,3,1));
		assertEquals(50,ci.calculateCompoundInterest(50, 4, 9, 2));
	}

}
