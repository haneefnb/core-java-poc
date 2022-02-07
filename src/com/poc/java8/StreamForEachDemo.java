package com.poc.java8;

import java.util.List;

/**
 * 
 * @author 1000475
 * Stream - We can use streams when we have bulk data in Collection, to process that bulk
 * we use stream in Java 8, not only fetching we can perform some operations 
 * like filter data, transform data and etc.for this Stream have some APIs
 * it is quiet handy compared Iterator in collection.
 * forEach is a Terminal operation, with that the stream will be closed.
 * forEach takes Consumer FI, thats we can write Lambda expression with in forEach
 */
public class StreamForEachDemo {
	
	public static void main(String[] args) {
		List<Product> products = ProductBuilder.loadProducts();
		products.stream().forEach((p)->{System.out.println(p);});
	}

	
}



