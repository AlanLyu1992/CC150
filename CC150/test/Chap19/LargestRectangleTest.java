/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap19;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class LargestRectangleTest {
	
	public LargestRectangleTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of find method, of class LargestRectangle.
	 */
	@Test
	public void testFind() {
		System.out.println("find");
		LargestRectangle instance = new LargestRectangle();
		int[] A = {6,1,5,4,5,2,6};		
		assertEquals(12, instance.find(A));
		int[] B = {2,1,5,6,2,3};		
		assertEquals(10, instance.find(B));
		int[] C = {2};		
		assertEquals(2, instance.find(C));

	}
	
}
