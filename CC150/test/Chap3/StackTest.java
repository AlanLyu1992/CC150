/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class StackTest {
	
	public StackTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of push method, of class Stack.
	 */
	@Test
	public void testPush() {
		System.out.println("push");
		Object data = null;
		Stack instance = new Stack();
		instance.push(data);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of pop method, of class Stack.
	 */
	@Test
	public void testPop() {
		System.out.println("pop");
		Stack instance = new Stack();
		Object expResult = null;
		Object result = instance.pop();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of peek method, of class Stack.
	 */
	@Test
	public void testPeek() {
		System.out.println("peek");
		Stack instance = new Stack();
		Object expResult = null;
		Object result = instance.peek();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of isEmpty method, of class Stack.
	 */
	@Test
	public void testIsEmpty() {
		System.out.println("isEmpty");
		Stack instance = new Stack();
		boolean expResult = false;
		boolean result = instance.isEmpty();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
