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
public class StdRMQTest {
	
	public StdRMQTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of query method, of class StdRMQ.
	 */
	@Test
	public void testQuery() {
		System.out.println("query");

		int[] A = {2,4,3,1,6,7,8,9,1,7};
		StdRMQ instance = new StdRMQ(A);

		assertEquals(8, instance.query(6, 9));
		assertEquals(3, instance.query(0, 9));
		assertEquals(1, instance.query(1, 1));
		assertEquals(4, instance.query(4, 7));
		assertEquals(0, instance.query(0, 2));
		int[] B = {2};
		instance = new StdRMQ(B);
		assertEquals(0, instance.query(0, 0));
		int[] C = {-1,2};
		instance = new StdRMQ(C);
		assertEquals(1, instance.query(1, 1));
		assertEquals(0, instance.query(0, 0));
		assertEquals(0, instance.query(0, 1));


		int[]D={0,1,0,1,1,1,1,3,0,1,1,2,0,1,3,1,2,1,0,1,2,1,0,2,1,1,1,1,0,1,0,1,1,1,2,1,0,1,0,1,1,1,0,1,2,1,2,1,1,1,2,1,0,1,1,2,4,1,2,1,0,1,0,1,1,1,1,1,1,2,0,1,1,1,0,1,1,1,1,1,0,1,1,1,1,2,0,1,3,2,0,1,2,1,2,1,1,1,1,2,0,1,0,1,1,1,1,2,1,1,1,1,2,1,0,2,1,1,1,5,1,3,1,1,2,2,2,1,0,1,0};
		instance = new StdRMQ(D);
		assertEquals(0, instance.query(0, 5));
		//assertEquals(8, instance.query(7, 10));
		System.out.println(D[118]);
		System.out.println(D[119]);
		System.out.println(D[120]);
		assertEquals(118, instance.query(118, 126));
		//assertEquals(138, instance.query(138, 140));
		//assertEquals(140, instance.query(139, 146));



	}
	
}
