/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap19;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class SuffixArrayTest {
	
	public SuffixArrayTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of Doubling method, of class SuffixArray.
	 */
	@Test
	public void testDoubling() {
		System.out.println("Doubling");
		String s = "aabaaaab";
		//String s = "banana";
		SuffixArray A = new SuffixArray(s);
		int[] rank = new int[s.length()];
		
		for (int n : A.rank) {
			System.out.print(n + " ");
		}
		System.out.println();
		for (int n : A.sa) {
			System.out.print(n + " ");
		}
		System.out.println();
		for (int n : A.height) {
			System.out.print(n + " ");
		}


	}
	
}
