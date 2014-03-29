/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap4;

import java.util.Optional;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class TreeNodeTest {
	
	public TreeNodeTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of left method, of class TreeNode.
	 */
	@Test
	public void testLeft() {
		System.out.println("left");
		TreeNode instance = null;
		Optional<TreeNode> expResult = null;
		Optional<TreeNode> result = instance.left();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of right method, of class TreeNode.
	 */
	@Test
	public void testRight() {
		System.out.println("right");
		TreeNode instance = null;
		Optional<TreeNode> expResult = null;
		Optional<TreeNode> result = instance.right();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
