package oops;

class Animal {
	public static void eating() {
		System.out.println("--Animal Eating----");
	}
}

class Dog extends Animal {
	public static void eating() {
		System.out.println("--Dog Eating----");
	}
}

public class MethodHidingDemo {
	public static void main(String[] args) {
		Animal dog = new Animal();
		Dog.eating();
	}
}
