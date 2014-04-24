/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap11;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class AVLTreeTest {
	
	public AVLTreeTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of add method, of class AVLTree.
	 */
	@Test
	public void testAdd() {
		System.out.println("add");

	}

	/**
	 * Test of delete method, of class AVLTree.
	 */
	@Test
	public void testDelete() {
		System.out.println("delete");

	}

	/**
	 * Test of size method, of class AVLTree.
	 */
	@Test
	public void testSize() {
		System.out.println("size");

	}

	/**
	 * Test of findRank method, of class AVLTree.
	 */
	@Test
	public void testFindRank() {
		System.out.println("findRank");

	}

	/**
	 * Test of insert method, of class AVLTree.
	 */
	@Test
	public void testInsert() {
		System.out.println("insert");

	}

	/**
	 * Test of remove method, of class AVLTree.
	 */
	@Test
	public void testRemove() {
		System.out.println("remove");

	}

	/**
	 * Test of balance method, of class AVLTree.
	 */
	@Test
	public void testBalance() {
		System.out.println("balance");

	}

	/**
	 * Test of rotate method, of class AVLTree.
	 */
	@Test
	public void testRotate() {
		System.out.println("rotate");

	}

	/**
	 * Test of height method, of class AVLTree.
	 */
	@Test
	public void testHeight() {
		System.out.println("height");
		AVLTree instance = new AVLTree();
		int expResult = 0;
		int result = instance.height(null);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
