/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap18;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class SuffixTreeTest {
	
	public SuffixTreeTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of growTree method, of class SuffixTree.
	 */
	@Test
	public void testGrowTree() {
		System.out.println("growTree");
		//String s = "bababbababbbabbaa";

/*		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 1000000; i++) {
			double num = Math.random();
			if(num > 0.5) {
				sb.append('a');
			}else {
				sb.append('b');
			}
		}
		SuffixTree instance = new SuffixTree(sb.toString());
*/		
		
		//assertEquals("abbbabbaa", instance.match("abbba"));
		String s = "abcabxabcd";
		SuffixTree instance = new SuffixTree(s);
		assertEquals("bxabcd", instance.match("bxa"));
		assertEquals("abcabxabcd", instance.match(""));
		assertEquals("bxabcd", instance.match("bx"));
		assertEquals("xabcd", instance.match("x"));
		assertEquals("cd", instance.match("cd"));
		assertEquals("abcabxabcd", instance.match(s));
		assertEquals(null, instance.match("s"));
		assertEquals(null, instance.match("xx"));
		assertEquals(null, instance.match("bb"));
		assertEquals(null, instance.match("cba"));
		assertEquals(null, instance.match("abcabxabcc"));
		assertEquals(null, instance.match("abcabxabcde"));
		    

	}
	
}
