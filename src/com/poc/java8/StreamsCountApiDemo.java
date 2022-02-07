package com.poc.java8;

import java.util.List;

/**
 * 
 * @author 1000475
 * count is used to count the no.of elements in the given stream
 *
 *
 */
public class StreamsCountApiDemo {
	public static void main(String[] args) {
		List<Product> products = ProductBuilder.loadProducts();
		long productsCount = 
			products.stream()
			.filter((p)->p.getPrice() > 5000)
			.count();
		
		System.out.println(productsCount);
	}
	
}


