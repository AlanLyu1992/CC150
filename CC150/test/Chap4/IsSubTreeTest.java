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
public class IsSubTreeTest {
	
	public IsSubTreeTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of isSubTree method, of class IsSubTree.
	 */
	@Test
	public void testIsSubTree() {
		System.out.println("isSubTree");
		TreeNode p = null;
		TreeNode q = null;
		boolean expResult = false;
		boolean result = IsSubTree.isSubTree(p, q);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
