/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap4;

import java.util.LinkedList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class TreeByDepthTest {
	
	public TreeByDepthTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of treeByDepth method, of class TreeByDepth.
	 */
	@Test
	public void testTreeByDepth() {
		System.out.println("treeByDepth");
        int[][] A = {{},{1,2,-1,-1,3},{1,2,3,-1,-1,4,-1,-1,5}};
        for(int[] array : A) {
            TreeNode tree = Trees.growTree(array, -1).orElse(null);
            LinkedList<LinkedList<TreeNode>> list = 
                TreeByDepth.treeByDepth(tree);
	    list.stream().map((row) -> {
		    row.stream().forEach((node) -> {
			    System.out.print(node.val+" ");
		    });
return row;
			}).forEach((_item) -> {
				System.out.println();
			});
            System.out.println();
        }
    }

	
}
