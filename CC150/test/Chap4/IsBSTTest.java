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
public class IsBSTTest {
	
	public IsBSTTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of isBST method, of class IsBST.
	 */
	@Test
	public void testIsBST() {
		System.out.println("isBST");
        int[][] A = {{-1},{1},{1,2,3},
                     {8,3,10,1,6,-1,14,-1,-1,4,7,13,-1}};
        for(int[] array : A) {
            TreeNode root = Trees.growTree(array, -1).orElse(null);
            System.out.println(IsBST.isBST(root));
        }
	}
	
}
