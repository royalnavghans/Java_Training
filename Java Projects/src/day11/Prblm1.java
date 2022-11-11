
/*ArrayList Assignment:

CReate java program to 

1.  create a new array list, add some colors (string) and print out the collection.
2.   iterate through all elements in a array list.
3.  insert an element in the array list at the first position
4.   update specific array element by given element.
5.   remove the third element from a array list
6.  search an element in a array list.
7.    sort a given array list.
8.  copy one array list in another.
9.  reverse elements in a array list.
10.  extract a portion of a array list.
11. of swap two elements in an array list
12.   join two array lists.
13.   empty an array list.
14.   increase the size of an array list.
15.  replace the second element of a ArrayList with the specified element.


*/

package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Prblm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> color = new ArrayList<String>();
		color.add("Pink");
		color.add("Red");
		color.add("Blue");
		color.add("Green");
		color.add("grey");
		System.out.println(color);
		System.out.println("\n//===============================Foreach Loop=================================//\n");

		for (String i : color) {
			System.out.println(i);
		}
		System.out.println("\n//=================================Iterator===============================//\n");
		ListIterator<String> it = color.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("\n//=================================After Adding first element===================//\n");
		color.add(0, "white");
		System.out.println(color);

		System.out.println(
				"\n//=================================Remove third element===============================//\n");

		color.remove(2);
		System.out.println(color);

		System.out.println(
				"\n//=================================Contains Of checking===============================//\n");

		System.out.println(color.contains("Blue"));
		System.out.println(
				"\n//=================================Searching of element===============================//\n");

		System.out.println(color.get(3));
		System.out.println(
				"\n//=================================Sort a given arrayList===============================//\n");
		Collections.sort(color);
		System.out.println(color);
		System.out.println("\n//=================================copy constructor===============================//\n");

		ArrayList<String> color1 = new ArrayList<>(color);
		System.out.println(color1);
		System.out.println("\n//=================================reverse Element===============================//\n");

		Collections.reverse(color);
		System.out.println(color);
		System.out.println("\n//=================================Sub-list===============================//\n");
		List<String> str = color.subList(2, 5);
		System.out.println(str);
		System.out.println("\n//=================================Swap elements===============================//\n");
		Collections.swap(color, 2, 3);
		System.out.println(color);
		System.out
				.println("\n//=================================Join the ArrayList===============================//\n");
		ArrayList<String> color2 = new ArrayList<>(color);
		color2.add("violet");
		color2.add("cyan");
		color2.add("Black");
		System.out.println(color2);
		System.out.println(
				"\n//=================================Replace the Specified Element===============================//\n");
		Collections.replaceAll(color, "grey", "orange");
		System.out.println(color);
		System.out.println("\n//=================================Increase the size===============================//\n");
		color.ensureCapacity(25);
		System.out
				.println("\n//=================================Empty an ArrayList===============================//\n");
		color.clear();
		System.out.println(color);

	}

}
