/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class IsRotationTest {
	
	public IsRotationTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of main method, of class IsRotation.
	 */
	@Test
	public void testMain() {
		System.out.println("main");
		String[] args = null;
		IsRotation.main(args);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of isRotation method, of class IsRotation.
	 */
	@Test
	public void testIsRotation() {
		System.out.println("isRotation");
		String s1 = "";
		String s2 = "";
		boolean expResult = false;
		boolean result = IsRotation.isRotation(s1, s2);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of isSubString method, of class IsRotation.
	 */
	@Test
	public void testIsSubString() {
		System.out.println("isSubString");
		String s1 = "";
		String s2 = "";
		boolean expResult = false;
		boolean result = IsRotation.isSubString(s1, s2);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
