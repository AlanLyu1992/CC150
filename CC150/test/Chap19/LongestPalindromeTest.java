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
public class LongestPalindromeTest {
	
	public LongestPalindromeTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of isPa method, of class LongestPalindrome.
	 */
	@Test
	public void testIsPa() {
		System.out.println("isPa");
		
        assertEquals("vlrlv", LongestPalindrome.isPa("uvvlrlvdedkosshjsckkvvnvwjuunlashntffnebvbdkuhimqcspuogpkubpqqfrl"));
	//assertEquals("vlrlv", LongestPalindrome.isPa("uvvlrlvdedkosshjsckkvvnvwjuunlashntffnebvbdkuhimqcspuogpkubpqqfrl"));
	//assertEquals("vlrlv", LongestPalindrome.isPa("uvvlrlvdedkosshjsckkvvnvwjuunlashntffnebvbdkuhimqcspdoshdmcsmmuogpkubpqqfrl"));
	//assertEquals("vlrlv", LongestPalindrome.isPa("uvvlrlvdedkosszzyhjsckkvvnvwjuunlashntffnebvbdkuhimqcspdoshdmwcsmmuozgpkzubpzqqfrl"));

		//assertEquals("vlrlv", LongestPalindrome.isPa("uvvlrlvdedkosszzyhjsckkvvnvwjuunlashntffnebvbdkuhimzqcspdoshdmwcsmmuozgpkzubpzqqfrl"));
		//assertEquals("vlrlv", LongestPalindrome.isPa("uvvlrlvdedkosszzyhjsckkvvnvwjuunbkufqnlashntffyynebvqnzzbceozuysyndrazzmqdereynlepinbsxvwtpwgazzvkeqazweyhapysdjrrbbdkuhimzqcspuuovazlneuyrcadoshdmwcsmmuozgpkzuxjegdsbpzqqfrl"));
		assertEquals("bb", LongestPalindrome.isPa("bb"));
                assertEquals("zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez", LongestPalindrome.isPa("zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez"));
		assertEquals("anana", LongestPalindrome.isPa("banana"));
		assertEquals("ississi", LongestPalindrome.isPa("mississipi"));
		assertEquals("baaaab", LongestPalindrome.isPa("abaaaab"));
		assertEquals("b", LongestPalindrome.isPa("bcedf"));
		assertEquals("", LongestPalindrome.isPa(""));
		
		


	}
	
}
