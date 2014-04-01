/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class FlipTest {
	
	public FlipTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of flip method, of class Flip.
	 */
	@Test
	public void testFlip() {
		System.out.println("flip");
		int m = 0;
		int n = 0;
		int expResult = 0;
		int result = Flip.flip(m, n);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
