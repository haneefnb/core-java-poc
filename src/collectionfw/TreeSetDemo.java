package collectionfw;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author 1000475
 * TreeSet doesn't allow null, it throws NPE at runtime.because it internally uses Comparable interface
 *
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		Set treeSet = new TreeSet();
		treeSet.add("Haneef");
		treeSet.add("Mathiha");
		treeSet.add(null);
		//treeSet.add(null);

		Iterator it = treeSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
