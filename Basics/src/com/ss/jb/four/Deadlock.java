/*
 * This class creates a deadlock between two threads
 */
package com.ss.jb.four;

/**
 * 
 * @author nickdeluca
 *
 */
public class Deadlock {

	public static void main(String[] args) {
		String strOne = "First piece of data";
		String strTwo = "Second piece of data";
		
		Runnable t1 = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized(strOne) {
						System.out.println("t1 has lock on strOne");
						Thread.sleep(100);
						synchronized(strTwo) {
							System.out.println("t1 has lock on strTwo");
						}
					}
					
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		};
		
		Runnable t2 = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized(strTwo) {
						System.out.println("t2 has lock on strTwo");
					
						synchronized(strOne) {
							System.out.println("t2 has lock on strOne");
						}
					}
					
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
			
		};
		
		new Thread(t1).start();
		new Thread(t2).start();
	}

}
