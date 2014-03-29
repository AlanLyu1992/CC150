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
public class TreesTest {
	
	public TreesTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of growTree method, of class Trees.
	 */
	@Test
	public void testGrowTree() throws Exception {
		System.out.println("growTree");
		int[] A = null;
		int nullFlag = 0;
		Optional<TreeNode> expResult = null;
		Optional<TreeNode> result = Trees.growTree(A, nullFlag);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of printTree method, of class Trees.
	 */
	@Test
	public void testPrintTree() {
		System.out.println("printTree");
		Optional<TreeNode> head = null;
		String NullSign = "";
		Trees.printTree(head, NullSign);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
