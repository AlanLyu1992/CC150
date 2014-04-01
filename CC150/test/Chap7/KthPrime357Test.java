/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap7;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class KthPrime357Test {
	
	public KthPrime357Test() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of find method, of class KthPrime357.
	 */
	@Test
	public void testFind() {
		System.out.println("find");
		int k = 12;
		int expResult = 63;
		int result = KthPrime357.find(k);
	}
	
}
