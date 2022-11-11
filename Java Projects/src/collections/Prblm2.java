
/*2. Create a linked list with a set of integer elements with max 10 elements and then perform below actions

   1.Adding an element at the specified position in the LinkedList
   2.Adding an element at the beginning of the LinkedList
   3.Adding an element at the end of the LinkedList
   4.Add 5 new elements at a time to the end of the list
   5.Use all possible methods to access the first element
   6.Use all possible methods to access the last element
   7.Use all possible methods to remove the first element
   8.use all possible elements to remove last element
   9.deteremine size of the list.
   10.RETRIEVE ALL THE ELEMENTS FROM THE LINKED LIST USING LIST ITERATOR.

*/


package collections;

import java.util.*;

public class Prblm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add("Dog");
		list.add("Cow");
		list.add("Lion");
		list.add("Tiger");
		list.add("Cat");
		list.add("Horse");
		list.add("Cheetah");
		list.add("Rat");
// add 5 elements at a time in linkedlist 
		list.addAll(Arrays.asList("hi", "hi", "hjhi", "bfb"));
		System.out.println(list);
		System.out.println("Elements in the LinkedList\n" + list);
		list.add(4, "Ox");
		System.out.println("Adding an element at the specified position in the LinkedList " + list);

		list.addFirst("Snake");
		System.out.println("Adding an element at the beginning of the LinkedList " + list);
		list.addLast(null);
		System.out.println("Adding an element at the end of the LinkedList " + list);
		list.addLast(null);
		System.out.println("Add 5 new elements at a time to the end of the list" + list);

	}

}