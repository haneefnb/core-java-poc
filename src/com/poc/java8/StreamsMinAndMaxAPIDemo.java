package com.poc.java8;

import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author 1000475
 * min & max method takes comparator obj as parameter, based on the logic we defined in this comparator
 * it will pick the firstone if use min, last one if we use max
 * 
 *
 */
public class StreamsMinAndMaxAPIDemo {
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
		Product chepestProduct = 
			products.stream()
			  .min(priceComp)
			  .get();
		System.out.println("Cheapest Product:"+chepestProduct);
		
		Product costliestProduct = 
				products.stream()
				  .max(priceComp)
				  .get();
			System.out.println("Costliest Product:"+costliestProduct);
		
	}
	
}


