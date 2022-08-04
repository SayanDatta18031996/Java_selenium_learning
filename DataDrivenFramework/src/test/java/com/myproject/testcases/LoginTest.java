package com.myproject.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.myproject.base.TestBase;

public class LoginTest extends TestBase {

	@Test
	public void loginAsBankManager() throws InterruptedException {
		log.debug("Inside Login Test");
		driver.findElement(By.cssSelector(OR.getProperty("bmlbtn"))).click();
		log.debug("Login successfull");
		Thread.sleep(3000);
	}
}
