/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author yin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({StackWithMinTest.class, PetsQueueTest.class, AnimalTest.class, CatTest.class, DogTest.class, HanoiTest.class, QueueWithStackTest.class, SetOfStacksTest.class, ThreeStacksTest.class, fullStackExceptionTest.class, emptyStackExceptionTest.class, StacksTest.class, StackTest.class})
public class Chap3Suite {

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}
	
}
