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
public class MissingIntTest {
	
	public MissingIntTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of find method, of class MissingInt.
	 */
	@Test
	public void testFind() {
		System.out.println("find");
		int[] A = null;
		int expResult = 0;
		int result = MissingInt.find(A);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
