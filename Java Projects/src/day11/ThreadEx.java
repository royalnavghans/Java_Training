package day11;

public class ThreadEx extends Thread {
	
	public void run() {
		for (int i = 0; i <=5; i++) {
			System.out.println("hi child"+i);
		}
	}
	
}
