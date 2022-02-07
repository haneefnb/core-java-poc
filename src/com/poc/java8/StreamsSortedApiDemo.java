package com.poc.java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author 1000475
 * sorted - is used to sort the elements in stream.
 * sort method having 2 variants. 1- sort(), 2. sort(Comparator obj)
 * we can use first one for natural sorting using Comparable
 * second one for Comparator
 *
 *
 */
public class StreamsSortedApiDemo {
	public static void main(String[] args) {
		
		Comparator<Product> priceComp = new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				if (p1.getPrice() > p2.getPrice()) {
					return 1;
				} else if (p1.getPrice() < p2.getPrice()) {
					return -1;
				} else {
					return 0;
				}
			}

		};
		
		List<Product> products = ProductBuilder.loadProducts();
		List<Product> sortedProducts = 
			products.stream()
			.sorted(priceComp)
			.collect(Collectors.toList());
		
		System.out.println("Products:"+products);
		System.out.println("Sorted Products:"+sortedProducts);
	}
	
}


