package PracticePrblm;

public class Reverse {

	public static void main(String[] args) {

			String s="welcome to india";
			String reverseString = "";
			//String[] sp = s.split(" ");
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
	reverseString=ch+reverseString;
			}
			System.out.println(reverseString);
		}
	

	}


