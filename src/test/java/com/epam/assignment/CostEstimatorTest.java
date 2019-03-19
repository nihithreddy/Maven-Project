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
public class CostEstimatorTest {

	@Test
	public void test() {
		CostEstimator ce = new CostEstimator();
		assertEquals(4800, ce.calculate_Cost(4, "standard"));
		assertEquals(4500, ce.calculate_Cost(3, "abovestandard"));
		assertEquals(5400, ce.calculate_Cost(3, "highstandard"));
	}

}
