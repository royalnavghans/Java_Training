package day9;

public class AlternateStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		for( i=0;i<20;i++) {
			if(i%5==0) {
				System.out.println("*");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
