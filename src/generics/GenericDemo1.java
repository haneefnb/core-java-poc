package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);	
		// Below is not allowed because this method will accept only class which extends Animal
		// printList(list);
	}
	
	public static void printList(List<? extends Animal> anyList) {
		System.out.println("print list");
	}
}
