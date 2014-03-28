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
import java.util.NoSuchElementException;
/**
 *
 * @author yin
 */
public class QueueWithStackTest {
	
	public QueueWithStackTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of offer method, of class QueueWithStack.
	 */
	@Test(expected = NoSuchElementException.class)
	public void testOffer() {
		System.out.println("offer");
        QueueWithStack<Integer> queue = new QueueWithStack<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        assertEquals((Integer)1, queue.poll());
        assertEquals((Integer)2, queue.poll());
        assertEquals((Integer)3, queue.poll());
        queue.poll();
	}

	/**
	 * Test of poll method, of class QueueWithStack.
	 */
	@Test
	public void testPoll() {
		System.out.println("poll");
		QueueWithStack instance = new QueueWithStack();
		Object expResult = null;
		Object result = instance.poll();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	
}
