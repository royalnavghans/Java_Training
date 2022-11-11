package day13;
@FunctionalInterface
interface name{
	void method();
	
}


public class LambdaEX {
void methods() {
	int a=10;
	System.out.println("hello "+ a);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
name obj1=()->{
	System.out.println("hello ");
};
obj1.method();
LambdaEX obj2=new LambdaEX();
name ref=obj2::methods;
ref.method();

	}

}
