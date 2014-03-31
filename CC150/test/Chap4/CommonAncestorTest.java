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
public class CommonAncestorTest {
	
	public CommonAncestorTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of commonAncestor method, of class CommonAncestor.
	 */
	@Test
	public void testCommonAncestor() {
		System.out.println("commonAncestor");
		TreeNode root = null;
		TreeNode p = null;
		TreeNode q = null;
		TreeNode expResult = null;
		TreeNode result = CommonAncestor.commonAncestor(root, p, q);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of hasNode2 method, of class CommonAncestor.
	 */
	@Test
	public void testHasNode2() {
		System.out.println("hasNode2");
		TreeNode node = null;
		TreeNode node2 = null;
		boolean expResult = false;
		boolean result = CommonAncestor.hasNode2(node, node2);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
