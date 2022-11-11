package day11;

import java.util.LinkedList;

public class CompareLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   LinkedList<String> c1= new LinkedList<String>();
	          c1.add("Red");
	          c1.add("Green");
	          c1.add("Black");
	          c1.add("White");
	          c1.add("Pink");
	          c1.add("Orange");
	          c1.add("Orange");

	          LinkedList<String> c2= new LinkedList<String>();
	          c2.add("Red");
	          c2.add("Green");
	          c2.add("Black");
	          c2.add("Orange");

	          //comparison output in linked list
	          LinkedList<String> c3 = new LinkedList<String>();
	          for (String e : c1)
	             c3.add(c2.contains(e) ? "Yes" : "No");
	          System.out.println(c3);  
	}}
	

































		/*
		 * System.out.
		 * println("\n//====================== compare two linked lists.=================================//\n"
		 * ); LinkedList<String> c1 = new LinkedList<String>(); c1.add("Red");
		 * c1.add("Red"); c1.add("Orange");
		 * 
		 * LinkedList<String> c2 = new LinkedList<>(); c2.add("Red"); c2.add("Color");
		 * c2.add("Orange"); c2.add("Black");
		 * 
		 * LinkedList<String> c3 = new LinkedList<String>(); for (String e : c1)
		 * c3.add(c2.contains(e) ? "Yes" : "No"); System.out.println(c3);
		 */
	
