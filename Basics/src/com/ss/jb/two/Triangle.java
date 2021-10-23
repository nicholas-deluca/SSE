/**
 * This class represents a triangle shape and implements the Shape interface
 */

package com.ss.jb.two;

/**
 * @author nickdeluca
 */
public class Triangle implements Shape {
	double area;
	float sOne, sTwo, sThree;
	
	public Triangle (float sideOne, float sideTwo, float sideThree) {
		sOne = sideOne;
		sTwo = sideTwo;
		sThree = sideThree;
		this.calculateArea();
	}

	@Override
	public void calculateArea() {
		area = 0.25 * Math.sqrt((sOne + sTwo + sThree) * (sTwo + sThree - sOne) * (sOne - sTwo + sThree) * (sOne + sTwo - sThree));
	}

	@Override
	public void display() {
		System.out.println(area);
	}
}
