/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap4;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class PathSumTest {
	
	public PathSumTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of pathSum method, of class PathSum.
	 */
	@Test
	public void testPathSum() {
		System.out.println("pathSum");
		TreeNode p = null;
		int sum = 0;
		List<List<Integer>> expResult = null;
		List<List<Integer>> result = PathSum.pathSum(p, sum);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
