package SeleniumPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	@Test
	public void a()
	{
		System.out.println("hello a method");
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
	
	@BeforeMethod
	public void h()
	{
		System.out.println("hello h");
	}
	
	@AfterMethod
	public void e()
	{
		System.out.println("Hello e");
	}
	@AfterClass
	public void f()
	{
		System.out.println("hello f");
	}
	@AfterTest()
	public void g()
	{
		System.out.println("Hello g");
	}
	@AfterSuite 
	public void i()
	{
		System.out.println("hello i");
	}
	@Test
	public void a1()
	{
		System.out.println("hello a1 test");
	}

}
