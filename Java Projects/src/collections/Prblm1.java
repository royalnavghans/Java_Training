
/*1.Create ArrayList with list of all possible vegetables using ArrayList() constructor and you perform below actions

Part-1:

to check if an ArrayList is empty using the isEmpty() method.
to find the size of an ArrayList using the size() method.
to access the element at a particular index in an ArrayList using the get() method.
to modify the element at a particular index in an ArrayList using the set() method.

Part-2:

Implement List Iterations using :

Iterate using for loop with index

Iterate using simple for-each loop


Iterate using an iterator() iterator(),

Iterate using a listIterator() to traverse in both directions  

Part-3:

Remove element at position 3 and 4

Remove all the elements from arrayList at a time.

*/

package collections;

import java.util.*;

public class Prblm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> vegetable = new ArrayList();
		vegetable.add("Tomato");
		vegetable.add("Potato");
		vegetable.add("Chilly");
		vegetable.add("LadiesFinger");
		System.out.println("\n=============================Part-1==============================\n");
		System.out.println("The size of an Arraylist is : " + vegetable);
		System.out.println("The size of an Arraylist is : " + vegetable.size());
		System.out.println("Whether my ArrayList isEmpty : " + vegetable.isEmpty());
		vegetable.get(2);
		System.out.println("After Accessing the element in  the particular index in an ArrayList : " + vegetable);
		vegetable.set(1, "Cauli Flower");
		System.out.println("After Modified the element in  the particular index in an ArrayList : " + vegetable);
	}

}
