/**
 *  This class represents a rectangle shape and implements the Shape interface
 */

package com.ss.jb.two;

public class Rectangle implements Shape {
	float area, height, width;
	
	public Rectangle (float h, float w) {
		height = h;
		width = w;
		this.calculateArea();
	}
	
	@Override
	public void calculateArea() {
		area = height * width;
	}

	@Override
	public void display() {
		System.out.println("Area: " + area);
	}

}
