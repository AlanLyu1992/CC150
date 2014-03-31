/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class FindSuccessorTest {
	
	public FindSuccessorTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of findSuccessor method, of class FindSuccessor.
	 */
	@Test
	public void testFindSuccessor() {
		System.out.println("findSuccessor");
		TreeNode start = null;
		TreeNode expResult = null;
		TreeNode result = FindSuccessor.findSuccessor(start);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
