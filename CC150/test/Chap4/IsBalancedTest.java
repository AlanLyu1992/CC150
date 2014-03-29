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
public class IsBalancedTest {
	
	public IsBalancedTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of isBalanced method, of class IsBalanced.
     * @throws java.lang.Exception
     */
	@Test
	public void testIsBalanced() throws Exception{
		System.out.println("isBalanced");
        int[][] A = {{},{-1}, {1,2,3,4,5,-1,-1,6}};
        boolean[] B = {true,true,false};
        for(int i = 0; i < A.length; i++) {
            Optional<TreeNode> tree = Trees.growTree(A[i], -1);
            Trees.printTree(tree, "#");
	    System.out.println();
            assertEquals(B[i], IsBalanced.isBalanced(tree));
        }
	}
	
}
