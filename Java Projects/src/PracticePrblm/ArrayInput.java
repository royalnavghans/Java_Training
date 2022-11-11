package PracticePrblm;
import day5.ReverseInt;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter values");
int abc[]=new int[5];
int count=0;
while(count<5) {
	abc[count]=sc.nextInt();
	count++;
}
for(int i=0; i<5;i++) {
	abc[i]=sc.nextInt();
}
for(int u:abc) {
	System.out.println(u);
}

	}
	
}
