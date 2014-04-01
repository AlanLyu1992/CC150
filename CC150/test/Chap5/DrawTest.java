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
public class DrawTest {
	
	public DrawTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of draw method, of class Draw.
	 */
	@Test
	public void testDraw() {
		System.out.println("draw");
		byte[] screen = null;
		int width = 0;
		int x1 = 0;
		int x2 = 0;
		int y = 0;
		Draw.draw(screen, width, x1, x2, y);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
