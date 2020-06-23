package com.simple;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class TestJunit extends TestCase {
	
	String message = "Hello Pallavi!!";
	String m = "hi";
	Message msg = new Message(message);
	
	@Test
	public void testPrintMessgae(){
		assertEquals(message, msg.showMessage());
//		assertEquals(m, msg.showMessage());
//		assertFalse(0 > 3);
		System.out.println("Count of test cases: "+this.countTestCases());
		System.out.println("Name: "+this.getName());
	}
}
