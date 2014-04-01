/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author yin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({SwapTest.class, ToBinaryTest.class, NextTest.class, InsertTest.class, FlipTest.class, MissingIntTest.class, DrawTest.class})
public class Chap5Suite {

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}
	
}
