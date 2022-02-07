package java8streams;

import java.util.function.Predicate;

public class PredicateDemo1 {
	public static void main(String[] args) {
		
		Predicate<String> maxFiveCheck = 
				x -> x.length() > 5;
		
		System.out.println(maxFiveCheck.test("Hello"));
		System.out.println(maxFiveCheck.test("Haneef"));
		
	}
}
