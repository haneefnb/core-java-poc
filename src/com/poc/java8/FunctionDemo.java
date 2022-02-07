package com.poc.java8;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		
		Function<Integer,String> messageFunction =
				(Integer i) -> {return "Hello "+i;};
				
		System.out.println(messageFunction.apply(2));
	}
}
