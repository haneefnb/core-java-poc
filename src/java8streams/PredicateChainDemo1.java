package java8streams;

import java.util.function.Predicate;

public class PredicateChainDemo1 {
	public static void main(String[] args) {
		
		Predicate<String> legth5Predicate = 
					(x) -> x.length() >5;
		
		Predicate<String> startWithSPredicate = 
				x -> x.startsWith("S");
				
		boolean result = legth5Predicate.and(startWithSPredicate).test("Sello Man");
		System.out.println(result);
	}
}
