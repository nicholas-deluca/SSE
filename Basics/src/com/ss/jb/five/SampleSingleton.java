/*
 * JB5 Assignment 6
 */
package com.ss.jb.five;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SampleSingleton {
	private static Connection conn = null;
	
	private static SampleSingleton instance = null;
	
	public static SampleSingleton getInstance() {
		if (instance == null) {
			synchronized(SampleSingleton.class) {
				if (instance == null) {
					instance = new SampleSingleton();
					return instance;
				}
			}
		}
		return instance;
	}

}
