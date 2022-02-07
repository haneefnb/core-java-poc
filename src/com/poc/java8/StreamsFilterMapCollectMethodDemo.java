package com.poc.java8;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author 1000475
 * 
 * filter -> which is used to filter the elements based on condition.
 * It takes Predicate FI as an argument.
 * It is a Intermediate operation, with that Stream will not be closed, we need to 
 * perform some terminal operation to see output.
 *  
 *map --> it is used to transform the data with in collection, in our example
 *we have a filtered list with Products, but we want only product names instead of
 *product, so we are using map to convert that Product object to String (product name).
 *It takes Function FI as an argument
 *this is also a intermediate operation
 *
 *collect -> it is used to create list/set from the data received from the stream.
 *So we can convert stream to Collection using collect method.
 *to collect method we pass Collectors.toList / toSet based on our requirement.
 *it is a terminal operation.
 *
 */
public class StreamsFilterMapCollectMethodDemo {
	public static void main(String[] args) {
		List<Product> products = ProductBuilder.loadProducts();
		List<String> highPriceProductNameList = 
			products.stream()
			.filter((p)->p.getPrice() > 5000)
			.map((x)->x.getName())
			.collect(Collectors.toList());
		
		System.out.println(highPriceProductNameList);
	}
	
}


