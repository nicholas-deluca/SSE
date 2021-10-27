/*
 * This program implements communication between two threads using a bounder buffer
 */
package com.ss.jb.four;

import java.util.LinkedList;

/**
 * 
 * @author nickdeluca
 *
 */
public class ThreadCommunication {

	public static void main(String[] args) {
		// Creates an instance of BoundedBuff of size 6
		BoundedBuff b = new BoundedBuff(6);
		
		// Producer thread
		Runnable t1 = new Runnable() {

			@Override
			public void run() {
				try {
					b.produce();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		};
		// Consumer thread
		Runnable t2 = new Runnable() {

			@Override
			public void run() {
				try {
					b.consume();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		};
		
		new Thread(t1).start();
		new Thread(t2).start();
	}
	
	// Helper class implementing a bounded buffer
	public static class BoundedBuff {
		private LinkedList<Integer> buff;
		private int size;
		
		// Constructor initializes the LinkedList and sets the size field
		public BoundedBuff(int s) {
			buff = new LinkedList<Integer>();
			size = s;
		}
		
		public void produce() throws InterruptedException {
			// Next value to be produced
			int counter = 0;
			
			while(true) {
				synchronized(this) {
					// When the buffer is full, waits until the consumer consumes and calls notify
					while (buff.size() >= size) {
						wait();
					}
					
					System.out.println(counter + " produced");
					buff.add(counter++);
					
					// Notifies the consumer that the buffer is populated
					notify();
					
					Thread.sleep(100);
				}
			}
		}
		
		public void consume() throws InterruptedException {
			while(true) {
				synchronized(this) {
					// When the buffer is empty, waits until it is populated by the producer
					while(buff.size() == 0) {
						wait();
					}
					
					System.out.println(buff.removeFirst() + " consumed");
					
					// Notifies the producer that there is space in the buffer
					notify();
					
					Thread.sleep(100);
				}
			}
		}
	}
}
