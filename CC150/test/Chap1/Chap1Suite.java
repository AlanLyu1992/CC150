/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author yin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Chap1.IsAnagramTest.class, Chap1.IsRotationTest.class, Chap1.RotateImageTest.class, Chap1.SetMatrixZeroTest.class, Chap1.IsUniqueTest.class, Chap1.RemoveDuplicateTest.class, Chap1.ReplaceSpacesTest.class, Chap1.TryTest.class})
public class Chap1Suite {

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}
	
}
