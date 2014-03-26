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
public class ThreeStacksTest {
    
	
	public ThreeStacksTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of push method, of class ThreeStacks.
	 */
	@Test
	public void testPush() {
		System.out.println("push");
		int stackNum = 0;
        ThreeStacks<String> stack;
        stack = new ThreeStacks<>(1,2,3);
		String data = "abc";
		ThreeStacks<String> instance = stack;
		instance.push(stackNum, data);
	}

	/**
	 * Test of pop method, of class ThreeStacks.
	 */
	@Test
	public void testPop() {
		System.out.println("pop");
		int stackNum = 0;
        ThreeStacks<String> stack;
        stack = new ThreeStacks<>(1,2,3);
        stack.push(0,"abc");
		ThreeStacks instance = stack;
		Object expResult = "abc";
		Object result = instance.pop(stackNum);
		assertEquals(expResult, result);
	}

	/**
	 * Test of peek method, of class ThreeStacks.
	 */
	@Test
	public void testPeek() {
		System.out.println("peek");
		int stackNum = 0;
        ThreeStacks<String> stack;
        stack = new ThreeStacks<>(1,2,3);
		ThreeStacks instance = stack;
		Object expResult = null;
		Object result = instance.peek(stackNum);
		assertEquals(expResult, result);
	}

	/**
	 * Test of isEmpty method, of class ThreeStacks.
	 */
	@Test
	public void testIsEmpty() {
		System.out.println("isEmpty");
		int stackNum = 0;
        ThreeStacks<String> stack;
        stack = new ThreeStacks<>(1,2,3);
		ThreeStacks instance = stack;
		boolean expResult = true;
		boolean result = instance.isEmpty(stackNum);
		assertEquals(expResult, result);
	}
	
}
