                                    
/*Provide solutions for the below problem statements.

1. Stream API and collection:

Using below dataset,implement streaming intermediate and terminal operators for the below requirements

sample dataset.

("Messi", 32, Gender.MALE, ("CF","CAM", "RF")),
("Griezmann", 28, Gender.MALE, ("CF", "CAM", "LF")),
("Arthur", 23, Gender.MALE, ("CM", "CAM")),
("Ter Stegen", 27, Gender.MALE, ("GK")),
("Puig", 20, Gender.MALE, ("CM", "CDM")),
("Jennifer", 29, Gender.FEMALE, ("CF", "CAM")),
("Jana", 17, Gender.FEMALE, ("CB")),
("Alexia", 25, Gender.FEMALE, ("CAM", "RF", "LF"))

A) Fetch the data gender value is matching with female  and age more than 23.
B) find  the count of footballers who are females and age more than 23.
C) get the position of male footballers who are the males and their age greater than 30 years.
D) display the first three footballers who are male and age greater than 25.
E) find the aggregate values of age of all male and female footballers.
F) using list of elements (4, 1, 3, 7, 5, 6, 2, 28, 15, 29) find first element which is greater that 5.*/


package assesment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.junit.platform.launcher.listeners.SummaryGeneratingListener;

class Data{
	String name;
	int age;
	String gender;
	List<String>Players;
	
	 public Data(String name, int age, String gender, List<String> players) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		Players = players;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getPlayers() {
		return Players;
	}

	public void setPlayers(List<String> players) {
		Players = players;
	}
	 
}

public class StreamAPI1 {

	
	private static final Function Players = null;

	public static void main(String[] args) {
		ArrayList<Data> al=new ArrayList<Data>();
		al.add(new Data("Messi", 32, "gender", Arrays.asList("CF","CAM", "RF")));
		al.add(new Data("Griezmann", 28, "gender", Arrays.asList("CF","CAM", "LF")));
		al.add(new Data("Arthur", 23, "gender", Arrays.asList ("CM", "CAM")));
		al.add(new Data("TerStegan", 27, "gender", Arrays.asList("GK")));
		al.add(new Data("Puig", 20, "gender", Arrays.asList("CM","CDM")));
		al.add(new Data("Jennifer", 29, "gender", Arrays.asList("CF","CAM")));
		al.add(new Data("Jana", 17, "gender", Arrays.asList("CB")));
		al.add(new Data("Alexia", 25, "gender", Arrays.asList("CAM","RF","LF")));
		List <Data> lis=(List<Data>) al.stream().filter(n->n.gender=="female").map(n->n.age>23); 
System.out.println(lis);
		long count=al.stream().filter(n->n.gender=="female").map(n->n.age>23).count();
		System.out.println(count);
		Map<String,Integer> li=al.stream().filter(n->n.gender=="male").map(n->n.age>30).collect(Collectors.groupingBy(Players));
		Set<String> key=li.keySet();
		for(String keys:key) {
			System.out.println(keys+""+keys.getClass());
		}
	
	}


}
