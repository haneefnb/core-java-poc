package java8streams;

public class LambdaDemo {
	public static void main(String[] args) {
		Runnable r = () -> System.out.println("--run method--");
		Thread t1 = new Thread(r);
		t1.start();
	}
}
	