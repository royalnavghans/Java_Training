package day11;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadEx obj=new ThreadEx();
obj.start();

System.out.println(obj.getState());
for (int i = 0; i <=5; i++) {
	System.out.println("Main Threads "+i);
}
	}

}
