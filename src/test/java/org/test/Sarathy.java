package org.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Sarathy {
	@Test
	public void tc1() {
System.out.println("method 1");
	}
	@Test
	public void tc2() {
		assertTrue(false);
System.out.println("method 2");

	}
	@Test
	public void tc3() {
System.out.println("method 3");
	}

}
