package jDBCCon;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestAssert {
AssertEx obj=new AssertEx();


@Test
@DisplayName("multiple two  numbers")
public void testMethod() {
	int mul=obj.method(5,20);
	
	assertEquals(100, mul,"given value is same");
	
}

@DisplayName("multiple two numbers")
@Test
public void testMethod1() {
	int mul1=obj.method(5,20);
	assertNotSame(100, mul1, "given value is not same");
} 


}
