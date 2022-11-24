package From_Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chrono_order {


	 @BeforeSuite()
	public void beforesuit() {
	System.out.println("Executing before suit");

	}

	@BeforeTest
	public void beforetest() {
	System.out.println("Executing befor test");
	}
	@BeforeClass
	public void beforeclass() {
	System.out.println("Executing before class");
	}
	@BeforeMethod
	public void beforemethod() {
	System.out.println("executing before method");
	}
	@Test
	public void hello() {
	System.out.println("ihello");
	}
	@Test
	public void bye() {
	System.out.println("gbye");

	}
	@AfterMethod
	public void aftermethod() {
	System.out.println("Executing after method");
	}
	@AfterClass
	public void afterclass() {
	System.out.println("Executing affter class");
	}
	@AfterTest()
	public void aftertest() {
	System.out.println("Executing after test");
	}
	@AfterSuite()
	public void aftersuit() {
	System.out.println("Executing affter suit");

	}

	
}


