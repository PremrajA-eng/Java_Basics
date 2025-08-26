package TestNGPrograms;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng1 {
	
	@Test
	public void a()
	{
		System.out.println("hello");
	}
	@BeforeTest
	public void b() {
		System.out.println("hello b");
	}
	@BeforeSuite
	public void c() {
		System.out.println("hello c");
	}
	@BeforeClass
	public void d() {
		System.out.println("hello d");
	}

}
