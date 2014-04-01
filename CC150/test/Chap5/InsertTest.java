/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class InsertTest {
	
	public InsertTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of insert method, of class Insert.
	 */
	@Test
	public void testInsert() {
		System.out.println("insert");
		int M = 0;
		int N = 0;
		int i = 0;
		int j = 0;
		int expResult = 0;
		int result = Insert.insert(M, N, i, j);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
