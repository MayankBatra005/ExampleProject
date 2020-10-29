import static org.junit.Assert.*;

import org.junit.Test;

public class TestExampleClass {

	// See the check mark changed to green showing it passed
	@Test
	public void test() {
		
		// Notice the test failed because actual was not equal to expected
		// lets have matching actual and expected inputs
		int actual=1;
		assertEquals(actual,ExampleClass.example1());
	}

	// Notice we have two functions and we have two test functions
	
	// This is still blue which means it failed
	@Test
	public void test2() {
		int actual=-1;
		assertEquals(actual,ExampleClass.example2());
	}
	// And both the functions have two separate functions which will be tested
	
	// Now lets create the suite file for the test cases 
}
