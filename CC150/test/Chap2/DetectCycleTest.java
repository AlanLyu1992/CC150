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
public class DetectCycleTest {
	
	public DetectCycleTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of detectCycle method, of class DetectCycle.
	 */
	@Test
	public void testDetectCycle() {
		System.out.println("detectCycle");
		ListNode head = null;
		DetectCycle instance = new DetectCycle();
		ListNode expResult = null;
		ListNode result = instance.detectCycle(head);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
