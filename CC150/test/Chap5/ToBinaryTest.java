/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class ToBinaryTest {
	
	public ToBinaryTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of printBinary method, of class ToBinary.
	 */
	@Test
	public void testPrintBinary() {
		System.out.println("printBinary");
		Double n = 0.71875;
		ToBinary.printBinary(n);

	}
	
}
