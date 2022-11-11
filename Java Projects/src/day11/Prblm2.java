
/*Build a java Program to 

1.loop a linked list in reverse order.
2.add the specified element at the front of a linked list.
3. add the specified element at the end of a linked list
4.retreive  the first and last occurrence of the specified elements in a linked list.
5.delete a specified element from a linked list.
6. delete first and last element from a linked list.
7.swap two elements in a linked list.
8.shuffle the elements in a linked list
9.join two linked lists
10.delete and return the first element of a linked list.
11. retrieve but does not delete, the first element of a linked list. 
12. retrieve but does not delete, the last element of a linked list. 
13. convert a linked list to array list.
14.compare two linked lists
15.test an linked list is empty or not
*/

package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Prblm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add(null);
		list.add("Pink");
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("grey");
		System.out.println("\n//===============================Print the list=================================//\n");
		System.out.println(list);
		System.out.println(
				"\n//===============================Addlist in first element in list=================================//\n");
		list.addFirst("black");
		System.out.println(list);
		System.out.println(
				"\n//===============================Addlist in last element in list=================================//\n");
		list.addLast("white");
		System.out.println(list);
		System.out.println(
				"\n//===============================loop in reverse list=================================//\n");
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		System.out.println(
				"\n//===============================Retrieve the first and last Occurance=================================//\n");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(
				"\n//======================delete a specified element from a linked list.=================================//\n");
		list.remove(3);
		System.out.println(list);
		System.out.println(
				"\n//======================delete first and last element from a linked list.=================================//\n");
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		System.out.println(
				"\n//======================swap two element from a linked list.=================================//\n");

		Collections.swap(list, 2, 3);
		System.out.println(list);
		System.out.println(
				"\n//======================Shuffle element from a linked list.=================================//\n");
		Collections.shuffle(list);
		System.out.println(list);
		System.out.println("\n//======================Join two  linked list.=================================//\n");
		LinkedList<String> list1 = new LinkedList<>(list);
		list1.add("Banana");
		list1.add("Orange");
		list1.add("Guava");
		list1.add("Mango");
		System.out.println(list1);
		System.out.println(
				"\n//======================retrieve but does not delete, the first element of a linked list.=================================//\n");
		System.out.println(list.peekFirst());
		System.out.println(list);
		System.out.println(
				"\n//======================delete and return the first element of a linked list.=================================//\n");
		System.out.println(list.get(2));
		System.out.println(
				"\n//======================retrieve but does not delete, the first element of a linked list.=================================//\n");
		System.out.println(list.peekLast());
		System.out.println(list);
		System.out.println(
				"\n//====================== convert a linked list to array list..=================================//\n");

		ArrayList<String> arr1 = new ArrayList<>(list);
		System.out.println(arr1);

		System.out.println("\n//====================== compare two linked lists.=================================//\n");
		LinkedList<String> lis = new LinkedList<>();
		lis.add("Red");
		lis.add("Red");
		lis.add("Orange");
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("Red");
		list2.add("Color");
		list2.add("Orange");
		list2.add("Black");

		LinkedList<String> list3 = new LinkedList<>();

		for (String e : lis)
			list3.add(list2.contains(e) ? "Yes" : " No");
		System.out.println(list3);

		System.out.println(lis.containsAll(list2));
		System.out.println("\n//====================== check Empty linked lists.=================================//\n");

		System.out.println(list.isEmpty());
	}

}
