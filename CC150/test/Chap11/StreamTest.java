/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap11;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class StreamTest {
	
	public StreamTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of tract method, of class Stream.
	 */
	@Test
	public void testTract() {
		System.out.println("tract");
        int[] A = {6,3,4,7,9,1,2,8,5,0};
		Stream instance = new Stream();
        for(int n : A) {
            instance.tract(n);
        }
	}

	/**
	 * Test of findNumRank method, of class Stream.
	 */
	@Test
	public void testFindNumRank() {
		System.out.println("findNumRank");
        int[] A = {5,1,4,4,5,9,7,13,3};
		Stream instance = new Stream();
        for(int n : A) {
            instance.tract(n);
        }
        assertEquals(0, instance.findNumRank(1));
        assertEquals(1, instance.findNumRank(3));
        assertEquals(3, instance.findNumRank(4));
	}
	
}
