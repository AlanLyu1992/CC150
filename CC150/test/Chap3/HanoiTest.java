/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class HanoiTest {
	
	public HanoiTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of solve method, of class Hanoi.
	 */
	@Test
	public void testSolve() {
		System.out.println("solve");
        Hanoi stacks = new Hanoi(3);
        stacks.solve();
        stacks = new Hanoi(4);
        stacks.solve();

	}
}
