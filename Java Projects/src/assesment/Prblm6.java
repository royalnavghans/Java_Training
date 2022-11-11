/*using thorw or throws exception ,implement serialization concept in interfaces.*/

package assesment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.*;

public class Prblm6 implements Serializable {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		try {
			
			File f=new File("C://4th.txt");
			Scanner sc=new Scanner(f);
           while(sc.hasNextLine()) {
        	   System.out.println(sc.nextLine());
        	  
           }
	
		}
	catch(Exception e) {
			System.out.println(e);
		}
		
	}}
		



