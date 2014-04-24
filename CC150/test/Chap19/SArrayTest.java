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
public class SArrayTest {
	
	public SArrayTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of da method, of class SArray.
	 */
	@Test
	public void testDa() {
		System.out.println("da");
		String s = "aabaaaab";	
		int n = s.length();
		int m = 26;
		int[] r = new int[n];
		int[] sa = new int[n];
		for(int i = 0; i < n; i++) {
			r[i] = s.charAt(i)-'a';
		}
		SArray instance = new SArray();
		instance.da(r, sa, n, m);

	}
	
}
