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
public class TowerTest {
	
	public TowerTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of findLongest method, of class Tower.
	 */
	@Test
	public void testFindLongest() {
		System.out.println("findLongest");
        int[] A = {60,180,61,179,62,181,63,170,70,190,50,150,55,180};
        int[] B = {50,150,55,180,62,181,70,190};
        People[] input = genPeople(A);
		People[] expResult = genPeople(B);
		People[] result = Tower.findLongest(input);
		assertArrayEquals(expResult, result);
	}
    private People[] genPeople(int[] A) {
		People[] B = new People[A.length/2];
        for(int i =0; i < A.length; i+=2) {
            B[i/2] = new People(A[i],A[i+1]);
        }
        return B;
    }

	
}
