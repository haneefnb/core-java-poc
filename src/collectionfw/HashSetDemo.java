package collectionfw;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * It internally uses Hastable, when we try to put a duplicate element,it will replace with latest value
 * @author 1000475
 *
 */
public class HashSetDemo {
	public static void main(String[] args) {
		Set hs = new HashSet();
		hs.add("Haneef");
		hs.add("Mathiha");
		hs.add(null);
		hs.add(null);

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
