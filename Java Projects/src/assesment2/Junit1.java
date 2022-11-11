package assesment2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Junit1 {
Employee1 test=new Employee1();
Junit test1=new Junit();
 @Test
void method() {
	assertEquals("Found", test.emp("raj"));
}
 @Test
 @DisplayName("Test Failed")
 
void method1() {
	assertEquals("Found", test.emp("raj"));
}
 @Test
 @Disabled
 @DisplayName("Diabling")
void method2() {
	assertEquals("Found", test.emp("raj"));
}
@Test
@BeforeAll
    void method3() {
   	 System.out.println("Testing before");
    }
    @Test
    @AfterAll
   void method4() {
  	 System.out.println("After testing all");
   }
    @Test
    @AfterEach
     void method5() {
    	System.out.println("After each test success");
    }
    
    @Test
     @BeforeEach
    void method6() {
    	 System.out.println("Before each test success");
     }
     @Test
    void method7() {
   	 assertEquals("rajeshvarma",test1.method("rajesh", "varma"));
    }
}

