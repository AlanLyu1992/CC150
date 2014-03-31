/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author yin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({PathSumTest.class, GrowBSTTest.class, TreeNodeTest.class, FindSuccessorTest.class, IsBalancedTest.class, CommonAncestorTest.class, IsBSTTest.class, TreesTest.class, DirectedGraphNodeTest.class, TreeByDepthTest.class, IsSubTreeTest.class})
public class Chap4Suite {

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}
	
}
