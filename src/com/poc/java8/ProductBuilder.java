package com.poc.java8;

import java.util.ArrayList;
import java.util.List;

public class ProductBuilder {
	public static List<Product> loadProducts(){
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(101, "Product 1", 2000.0));
		products.add(new Product(102, "Product 2", 5000.0));
		products.add(new Product(103, "Product 3", 10000.0));
		products.add(new Product(104, "Product 4", 6000.0));
		products.add(new Product(105, "Product 5", 7000.0));
		return products;
	}
}
