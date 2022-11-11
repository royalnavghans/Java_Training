package jDBCCon;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestingThatMethods {
ArrayList<String> arr=new ArrayList<>();

public void methods(String name) {

	arr.remove(name);
}
public void methods1(String name) {

	arr.add(name);
}
boolean name1(String name) {
	return arr.add(name);
}
public int methods2() {
	
	return arr.size();
}
public void methods3() {
	
	arr.clear();
}
}
