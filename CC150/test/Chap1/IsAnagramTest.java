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
public class IsAnagramTest {
	
	public IsAnagramTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of isAnagram method, of class IsAnagram.
	 */
	@Test
	public void testIsAnagram() {
		System.out.println("isAnagram");
		String s1 = "";
		String s2 = "";
		boolean expResult = false;
		boolean result = IsAnagram.isAnagram(s1, s2);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of main method, of class IsAnagram.
	 */
	@Test
	public void testMain() {
		System.out.println("main");
		String[] args = null;
		IsAnagram.main(args);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
