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
public class SetOfStacksTest {
	
	public SetOfStacksTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of push method, of class SetOfStacks.
	 */
	@Test(expected = NoSuchElementException.class)
	public void testPush() {
		System.out.println("push");
        SetOfStacks<Integer> stack = new SetOfStacks(2);
        for(int i = 0; i < 5; i++) {
            stack.push(i);
        }
        assertEquals((Integer)4, stack.pop());
        assertEquals((Integer)3, stack.pop());
        assertEquals((Integer)2, stack.pop());
        assertEquals((Integer)1, stack.pop());
        assertEquals((Integer)0, stack.pop());
        stack.pop();
	}


	/**
	 * Test of popAt method, of class SetOfStacks.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testPopAt() {
		System.out.println("popAt");
        SetOfStacks<Integer> stack = new SetOfStacks(2);
        for(int i = 0; i < 5; i++) {
            stack.push(i);
        }
        assertEquals((Integer)1, stack.popAt(0));
        assertEquals((Integer)4, stack.popAt(1));
        assertEquals((Integer)2, stack.popAt(0));
        stack.push(6);
        assertEquals((Integer)6, stack.popAt(1));
        assertEquals((Integer)3, stack.popAt(0));
        assertEquals((Integer)0, stack.popAt(0));
        stack.popAt(1);
	}

	
}
