package day11;

class srihari implements Runnable{
	public void run(){
		for (int i = 0; i <=5; i++) {
			System.out.println("hi hello "+i);
			try {Thread.sleep(1000);}catch(Exception e) {}
		
		
		
	}
}}
class vishnu implements Runnable{
	public void run(){
	for (int i = 0; i <=5; i++) {
		System.out.println("hi hello "+i);
		try {Thread.sleep(1000);}catch(Exception e) {}
	}
}}

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable obj1=new srihari();
Runnable obj2 =new vishnu();
Thread t1=new Thread(obj1);
Thread t2=new Thread(obj2);
t1.start();
t2.start();



	}

}
