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

/**
 *
 * @author yin
 */
public class PetsQueueTest {
	
	public PetsQueueTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}

	/**
	 * Test of enqueue method, of class PetsQueue.
	 */
	@Test
	public void testEnqueue() {
		System.out.println("enqueue");
        Cat cat1 = new Cat("Cat1");
        Cat cat2 = new Cat("Cat2");
        Dog dog1 = new Dog("Dog1");
        Dog dog2 = new Dog("Dog2");
        PetsQueue queue = new PetsQueue();
        queue.enqueue(cat1);
        queue.enqueue(dog2);
        queue.enqueue(cat2);
        queue.enqueue(dog1);
        Dog dog= queue.dequeue(Chap3.Dog.class);
        System.out.println(dog.name);
        Animal pet = queue.dequeueAny();
        System.out.println(pet.name);
        pet = queue.dequeueAny();
        System.out.println(pet.name);
        pet = queue.dequeueAny();
        System.out.println(pet.name);
        System.out.println(pet.getClass().getName());

	}

	
}
