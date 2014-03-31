/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yin
 */
public class DirectedGraphNodeTest {
	
	public DirectedGraphNodeTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}


	/**
	 * Test of isConnected method, of class DirectedGraphNode.
	 */
	@Test
	public void testIsConnected() {
		System.out.println("isConnected");
        int[][] A = {{1,2,3,-1,2,1,4,-1,4,1,5,-1}};
        boolean[] B = {true};
        DirectedGraphNode sol = new DirectedGraphNode(0);
        for(int i = 0; i < A.length; i++) {
            DirectedGraphNode graph = sol.genGraph(A[i],-1);
            sol.printGraph(graph, "#");
            assertEquals(B[i], sol.isConnected(graph, 
                        graph.next.get(0).next.get(1).next.get(1)));
	    assertEquals(false, sol.isConnected(graph, 
                        sol));
        }
	}

	/**
	 * Test of genGraph method, of class DirectedGraphNode.
	 */
	@Test
	public void testGenGraph() {
		System.out.println("genGraph");
		int[] A = null;
		int sep = 0;
		DirectedGraphNode instance = null;
		DirectedGraphNode expResult = null;
		DirectedGraphNode result = instance.genGraph(A, sep);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of printGraph method, of class DirectedGraphNode.
	 */
	@Test
	public void testPrintGraph() {
		System.out.println("printGraph");
		DirectedGraphNode start = null;
		String sep = "";
		DirectedGraphNode instance = null;
		instance.printGraph(start, sep);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
