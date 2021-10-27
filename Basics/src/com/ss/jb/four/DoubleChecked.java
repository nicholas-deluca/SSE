/**
 * Implementation of a Singleton class with Double-Checked Locking
 */
package com.ss.jb.four;

/**
 * @author nickdeluca
 */
public class DoubleChecked {
	
	private static volatile DoubleChecked instance = null;

	private DoubleChecked() {
		
	}
	
	/*
	 * Double-Checked Locking is achieved by checking the lock condition both before and within the synchronized block
	 */
	public static DoubleChecked getInstance() {
		if(instance == null) {
			synchronized(DoubleChecked.class) {
				if(instance == null) {
					instance = new DoubleChecked();
				}
			}
		}
		return instance;
	}
}
