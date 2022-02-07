package java8streams;

import java.util.Arrays;
import java.util.List;

/**
 * filter method takes Predicate interface as an argument
 * Since Predicate is a Functional interface, and lamda expression returns Functional 
 * interface, we passed lambda expression with in filter method.
 * @author 1000475
 *
 */
public class FunctionalInterfacePredicate {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 4, 3, 1, 8, 5);
		
		numbers.stream().
				filter(x -> x % 2 == 0).forEach(System.out::println);
	}
	
}
