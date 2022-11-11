package jDBCCon;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JunitTes {
		@Test
	public void shouldReturnAreaOfRec() {
		C7 ob = new C7();
		int area = ob.getArea(5, 3);
		System.out.println(area);
	}
	
}
