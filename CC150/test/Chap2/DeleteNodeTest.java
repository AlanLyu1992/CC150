/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class DeleteNodeTest {
	
	public DeleteNodeTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of deleteNode method, of class DeleteNode.
	 */
	@Test
	public void testDeleteNode() {
		System.out.println("deleteNode");
		ListNode node = null;
		DeleteNode instance = new DeleteNode();
		instance.deleteNode(node);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
