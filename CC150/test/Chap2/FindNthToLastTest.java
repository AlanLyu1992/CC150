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
public class FindNthToLastTest {
	
	public FindNthToLastTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of findNthToLast method, of class FindNthToLast.
	 */
	@Test
	public void testFindNthToLast() {
		System.out.println("findNthToLast");
		ListNode head = null;
		int n = 0;
		FindNthToLast instance = new FindNthToLast();
		ListNode expResult = null;
		ListNode result = instance.findNthToLast(head, n);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
