package com.ss.jb.four;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineTest {

	@Test
	void testSlope() {
		double x0 = (Math.random()*10), x1 = (Math.random()*10), y0 = (Math.random()*10), y1 = (Math.random()*10), slope;
		slope = (y1 - y0)/(x1 - x0);
		
		Line l1 = new Line(x0, y0, x1, y1);
		assertEquals(slope, l1.getSlope(), 0.0001);
		
		Line l2 = new Line(x0, y0, x0, y1);
		try {
			l2.getSlope();
			fail("Didn't throw ArithmeticException for divide by 0");
		}
		catch(ArithmeticException e) {}
	}

	@Test
	void testDistance() {
		double x0 = (Math.random()*10), x1 = (Math.random()*10), y0 = (Math.random()*10), y1 = (Math.random()*10), distance;
		distance = Math.sqrt(Math.pow((x1 - x0), 2) + Math.pow((y1 - y0), 2));
		
		Line l1 = new Line(x0, y0, x1, y1);
		assertEquals(distance, l1.getDistance());
	}
	
	@Test
	void testParallel() {
		double x0 = (Math.random()*10), x1 = (Math.random()*10), y0 = (Math.random()*10), y1 = (Math.random()*10);
		
		Line l1 = new Line(x0, y0, x1, y1);
		Line l2 = new Line(x0 - 5, y0 - 5, x1 - 5, y1 - 5);
		Line l3 = new Line(x0 - 5, y0, x1, y1);
		
		assertTrue(l1.parallelTo(l2));
		assertFalse(l1.parallelTo(l3));
	}
}
