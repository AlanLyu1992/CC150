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
public class StacksTest {
	
	public StacksTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of InsertionSort method, of class Stacks.
	 */
	@Test
	public void testInsertionSort() {
		System.out.println("InsertionSort");
		int[] A = {3, 2, 5, 6, 1, 7, 4};
		Stack<Integer> stack = new Stack<>();
		for (int n : A) {
			stack.push(n);
		}
		Stacks.insertionSort(stack, (a, b) -> (a - b));
		for (int n : A) {
			System.out.println(stack.pop());
		}
	}

}
