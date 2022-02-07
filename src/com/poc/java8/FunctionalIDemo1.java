package com.poc.java8;

@FunctionalInterface
public interface FunctionalIDemo1 {
	public abstract void m1();
	
	default void m2() {
		
	}
	
	static void m3() {
		
	}
}
