/*build a program to

1.append the specified element to the end of a hash set
2.iterate through all elements in a hash set.
3.empty an hash set
4.test a hash set is empty or not
5.convert a hash set to an array.
6.compare two hash set*/


package day12;

import java.util.HashSet;
import java.util.Iterator;


public class Prblm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashSet<Integer> hs=new HashSet<>();
 System.out.println("\n//============ Append the specified element to the end of a hash set ======================//\n");
 hs.add(20);
 hs.add(22);
 hs.add(26);
 hs.add(27);
 hs.add(29);
 System.out.println(hs);
 System.out.println("\n//============ Iterate through all elements in a hash set. ======================//\n");
 
 Iterator<Integer>list=hs.iterator();
 while(list.hasNext()) {
	 System.out.println(list.next()); 
 }
 System.out.println("\n//============ .empty an hash set. ======================//\n");
  
 //hs.clear();
 System.out.println(hs);
 System.out.println("\n//============  check whether is empty or not in hash set. ======================//\n");
 System.out.println(hs.isEmpty());
 System.out.println("\n//============  .convert a hash set to an array. ======================//\n");
  hs.toArray();
  System.out.println(hs);
 
  System.out.println("\n//============  compare two hash set. ======================//\n");
 
HashSet<Integer>hs1=new HashSet<>();
hs.add(20);
hs.add(22);
hs.add(26);
hs.add(27);
hs.add(29);
 
HashSet<Integer>hs3=new HashSet<>();
 
 for (Integer in : hs) 
	
hs3.add(hs1.contains(in) ? 1 : 0);
 System.out.println("Compare two Sets if true means no:1 or false no:0....: "+hs3);
 
 
 
 
	}

}
