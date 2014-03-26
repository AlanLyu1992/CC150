/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author yin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Chap2.AddTwoNumsTest.class, Chap2.FindNthToLastTest.class, Chap2.DeleteNodeTest.class, Chap2.ListNodeTest.class, Chap2.DeleteDupsTest.class, Chap2.DetectCycleTest.class})
public class Chap2Suite {

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}
	
}
