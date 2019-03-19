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
public class SimpleInterestTest {

	@Test
	public void test() {
		SimpleInterest si=new SimpleInterest();
		assertEquals(6,si.calculateSimpleInterest(100, 2, 3));
		assertEquals(3,si.calculateSimpleInterest(100,3,1));
		assertEquals(1,si.calculateSimpleInterest(100,1,1));
	}

}
