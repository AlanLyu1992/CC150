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
public class DeleteDupsTest {
	
	public DeleteDupsTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of deleteDup method, of class DeleteDups.
	 */
	@Test
	public void testDeleteDup() {
		System.out.println("deleteDup");
		ListNode head = null;
		DeleteDups instance = new DeleteDups();
		instance.deleteDup(head);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getLength method, of class DeleteDups.
	 */
	@Test
	public void testGetLength() {
		System.out.println("getLength");
		ListNode head = null;
		DeleteDups instance = new DeleteDups();
		int expResult = 0;
		int result = instance.getLength(head);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of mergeSort method, of class DeleteDups.
	 */
	@Test
	public void testMergeSort() {
		System.out.println("mergeSort");
		ListNode head = null;
		int step1 = 0;
		int step2 = 0;
		DeleteDups instance = new DeleteDups();
		ListNode expResult = null;
		ListNode result = instance.mergeSort(head, step1, step2);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
