package generics;

import java.io.Serializable;

public class Printer<T extends Animal & Serializable> {
	
	T someObj;
	
	
}
