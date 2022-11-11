package assesment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Junit {
	public String method(String a,String b) {
		return a+b;
	}


	}


class Employee1{
	List<String>names=new ArrayList(Arrays.asList("ram","raj","suresh"));
	String emp(String name) {
		if(names.contains(name)) {
			return "Found";
		}else {
			return "NotFound";
		}
	}
}
