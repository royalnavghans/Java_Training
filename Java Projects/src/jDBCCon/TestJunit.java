package jDBCCon;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestJunit {
	TestingThatMethods obj=new TestingThatMethods();
	@Test
	@DisplayName("Added succesfully")
void Test() {

obj.methods1("praveen");
obj.methods1("srihari");
obj.methods1("kumar");
obj.methods1("vishnu");

	}
	
	@Test	
	@DisplayName("checked size successfully")
 void size() {
	obj.methods2();
	
}@Test
	@DisplayName("Assertedtrue successfully")
	void assert1() {
		assertTrue(obj.name1("vishnu"));
	}@Test
	@DisplayName("AssertedFalse successfully")
	void assert2() {
		assertFalse(obj.name1("vishnu"));
	}
	@Test
	@DisplayName("removed successfully")
void remove() {
	obj.methods("praveen");
	obj.methods("kumar");
}
	@Test
	@DisplayName("cleared successfully")
void clear() {
	obj.methods3();
}
	@Test
	@DisplayName("AssertEquals of successfully")
void remove3() {
	assertEquals(0,obj.name1("kumar"));
}
	@Test
	@DisplayName("AssertNotEquals of successfully")
void remove4() {
	assertNotEquals(2,obj.name1("kumar"));
}

}
