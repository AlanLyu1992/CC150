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
public class StackWithMinTest {

	public StackWithMinTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of isEmpty method, of class StackWithMin.
	 */
	@Test
	public void testIsEmpty() {
		System.out.println("isEmpty");
		StackWithMin<Integer> instance
		    = new StackWithMin<>((a, b) -> a - b);
		boolean expResult = true;
		boolean result = instance.isEmpty();
		assertEquals(expResult, result);
	}

	/**
	 * Test of push method, of class StackWithMin.
	 */
	@Test
	public void testPush() {
		System.out.println("push");
		Integer data = 1;
		StackWithMin<Integer> instance
		    = new StackWithMin<>((a, b) -> a - b);
		instance.push(data);
		Object expResult = 1;
		Object result = instance.pop();
		assertEquals(expResult, result);
	}

	/**
	 * Test of pop method, of class StackWithMin.
	 */
	@Test
	public void testPop() {
		System.out.println("pop");
		StackWithMin<Integer> instance
		    = new StackWithMin<>((a, b) -> a - b);
		instance.push(1);
		Object expResult = 1;
		Object result = instance.pop();
		assertEquals(expResult, result);
	}

	/**
	 * Test of min method, of class StackWithMin.
	 */
	@Test
	public void testMin() {
		System.out.println("min");
		StackWithMin<Integer> instance
		    = new StackWithMin<>((a, b) -> a - b);
		instance.push(5);
		instance.push(6);
		instance.push(3);
		instance.push(7);
		instance.pop();
		instance.pop();
		Object expResult = 5;
		Object result = instance.min();
		assertEquals(expResult, result);
	}

	/**
	 * Test of peek method, of class StackWithMin.
	 */
	@Test
	public void testPeek() {
		System.out.println("peek");
		StackWithMin<Integer> instance
		    = new StackWithMin<>((a, b) -> a - b);
		Object result = instance.peek();
		assertEquals(null, result);
	}

}
