package com.poc.java8;

import java.util.stream.Stream;

/**
 * 
 * @author 1000475
 * of is a factory method available in Stream class.
 * it will take group of values like String, integer or any objects and returns Stream
 * So with the given stream we can perform operation using methods.
 * 
 *
 */
public class StreamsOfAPIDemo {
	public static void main(String[] args) {
		Stream s1 = Stream.of("Product1","product2","product3");
		s1.forEach((p)->{System.out.println(p);});
	}
	
}


