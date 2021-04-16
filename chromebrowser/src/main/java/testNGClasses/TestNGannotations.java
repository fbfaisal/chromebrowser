package testNGClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGannotations {
	
	@BeforeSuite
	public void beforesuite() {
		
	System.out.println("before suite");
		
	}

	@Test(priority=2)
	public void test1() {
	System.out.println("Test1...");
		
	}
	
	@Test(description="this is test2")
	public void test2() {	
	System.out.println("Test2....");
	}
	
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("before method....");

	}
	@AfterMethod
	public void aftermethod() {
		
		
		System.out.println("aftermethod.......");
	}
		
	@BeforeClass
	public void beforeclass() {
		
		System.out.println("before class...");
		
	}
	
	@AfterClass
	public void Afterclass() {
		
		System.out.println("After class...");
		
	}
	
	@AfterSuite
	public void aftersuite() {
		
	System.out.println("After suite....");
		
	}
	
	@AfterTest
	public void aftertest() {
		
	System.out.println("After Test....");
		
	}

	@BeforeTest
	public void beforetest() {
		
	System.out.println("Before Test....");
		
	}


}

