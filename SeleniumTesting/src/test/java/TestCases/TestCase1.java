package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void openDBConn() {
		System.out.println("Opening DB connection");
	}
	
	@AfterTest
	public void closeDBConn(){
		System.out.println("Closing DB connection");
	}

	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launcing Browser");
	}
	
	@AfterMethod
	public void closebrowser() {
		System.out.println("Closing Browser");
	}
	
	@Test(priority = 1)
	public void doUserReg() {
		System.out.println("Executing registration test");
	}
	
	@Test(priority = 2)
	public void doLogin(){
		System.out.println("Executing login test");
	}
	
}
