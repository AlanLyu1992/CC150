/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class AddTwoNumsTest {
	
	public AddTwoNumsTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of AddTwoNums method, of class AddTwoNums.
	 */
	@Test
	public void testAddTwoNums() {
		System.out.println("AddTwoNums");
		ListNode num1 = null;
		ListNode num2 = null;
		AddTwoNums instance = new AddTwoNums();
		ListNode expResult = null;
		ListNode result = instance.AddTwoNums(num1, num2);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
