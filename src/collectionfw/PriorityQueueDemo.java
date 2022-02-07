package collectionfw;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Product> productsQueue = new PriorityQueue<>();
		Product p1 = new Product(100,"Product 1",20.76);
		Product p2 = new Product(101,"Product 2",10.76);
		Product p3 = new Product(102,"Product 3",5.76);
		Product p4 = new Product(103,"Product 4",30.76);
		Product p5 = new Product(104,"Product 5",60.76);
		productsQueue.offer(p1);
		productsQueue.offer(p2);
		productsQueue.offer(p3);
		productsQueue.offer(p4);
		productsQueue.offer(p5);
		
		// Poll is used to retrieve and remove the first element
		//Product removedProduct = productsQueue.poll();
		
		// peek is used to get the first element
		Product firstProduct = productsQueue.peek();
		
		//System.out.println("My First Product is:"+firstProduct);

		// Print the elements in Queue
		Iterator<Product> productItr = productsQueue.iterator();
		System.out.println("Fetching through Iterator");
		while (productItr.hasNext()) {
			System.out.println(productItr.next());
		}
		
		System.out.println("Fetching using Poll");
		while(productsQueue.size() >0) {
			System.out.println(productsQueue.poll());
		}

	}
}

class Product implements Comparable<Product>{
	private int id;
	private String name;
	private Double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product(int id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product p1) {
		if (this.price > p1.price)
			return 1;
		else if (this.price < p1.price)
			return -1;
		else
			return 0;
	}
	
	

}
