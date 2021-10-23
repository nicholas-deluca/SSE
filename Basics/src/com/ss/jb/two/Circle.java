/**
 * This class represents a circle shape and implements the Shape interface
 */

package com.ss.jb.two;

/**
 * 
 * @author nickdeluca
 *
 */
public class Circle implements Shape {
	double area;
	float radius;
	
	public Circle (float r) {
		radius = r;
		this.calculateArea();
	}
	
	@Override
	public void calculateArea() {
		area = Math.PI * radius * radius;
	}

	@Override
	public void display() {
		System.out.println(area);
	}
	
}
