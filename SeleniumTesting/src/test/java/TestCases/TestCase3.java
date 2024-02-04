package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {
	@Test(priority = 1)
	public void doUserReg() {
		System.out.println("Executing registration test");
		Assert.fail("User failed to register");
	}
	
	@Test(priority = 2,dependsOnMethods = "doUserReg")
	public void doLogin(){
		System.out.println("Executing login test");
	}
	//"dependsOnMethods" method use for if the testcase dependent on other methods. If the parent method fails dependent methods will be skipped. If any testcase dependent on other TC but you want to run it every time the use "AlwaysRun=true"  
	@Test(priority = 3,dependsOnMethods = "doUserReg", alwaysRun = true)
	public void thirdTest(){
		System.out.println("Executing third test");
	}
	@Test(priority = 4,dependsOnMethods = "doUserReg")
	public void fourthTest(){
		System.out.println("Executing fourth test");
	}
}
