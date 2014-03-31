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
import java.util.Optional;

/**
 *
 * @author yin
 */
public class GrowBSTTest {
	
	public GrowBSTTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of growTree method, of class GrowBST.
	 */
	@Test
	public void testGrowTree() {
		System.out.println("growTree");
        int[][] A = {{},{1},{1,2,3},{1,2,3,4,5,6},{1,2,3,4,5,6,7},
		     {1,2,3,4,5,6,7,8,9,10,11}};
        for(int[] array : A) {
            TreeNode tree = GrowBST.growTree(array);
            Trees.printTree(Optional.ofNullable(tree), "#");
        }
	}
	
}
