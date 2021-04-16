package testNGClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {
	
	@Test
	public void hardassert() {
		
		Assert.assertEquals("hello", "hello","NOT MATCHED");
		
	}

}
