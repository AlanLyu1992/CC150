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
public class IsUniqueTest {
	
	public IsUniqueTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of main method, of class IsUnique.
	 */
	@Test
	public void testMain() {
		System.out.println("main");
		String[] args = null;
		IsUnique.main(args);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of isUnique1 method, of class IsUnique.
	 */
	@Test
	public void testIsUnique1() {
		System.out.println("isUnique1");
		String s = "";
		boolean expResult = false;
		boolean result = IsUnique.isUnique1(s);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of isUnique2 method, of class IsUnique.
	 */
	@Test
	public void testIsUnique2() {
		System.out.println("isUnique2");
		String s = "";
		boolean expResult = false;
		boolean result = IsUnique.isUnique2(s);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
