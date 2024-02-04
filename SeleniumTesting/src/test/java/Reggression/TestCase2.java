package Reggression;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {
	@Test
	public void validateTitles() {
		String expectedTitle = "Yahoo.com";// coming from excel sheet
		String actualTitle = "Gmail.com";// coming from selenium
		System.out.println("Test Starting");
		SoftAssert softAssert=new SoftAssert();
//
//		if (expectedTitle.equals(actualTitle)) {
//			System.out.println("Test case pass");
//		} 
//		else {
//			System.out.println("Test case failed");
//		}
		System.out.println("Validating String");
// Assert is a hard class if any case failed Assert break the execution and goes to the next step. SoftAssert will run the every step in the test case and give the result.
		//Assert.assertEquals(expectedTitle, actualTitle);
		softAssert.assertEquals(expectedTitle, actualTitle);
		// Assert.assertTrue(false,"Element Not found");
		// Assert.fail("This test case is failing");
		System.out.println("Validating image");
		//Assert.assertEquals(false, true,"Image validation failed");
		softAssert.assertEquals(false, true,"Image validation failed");
		System.out.println("validating textbox");
		//Assert.assertEquals(true, false,"TextBox Validation failed");
		softAssert.assertEquals(true, false,"TextBox Validation failed");
		System.out.println("Test Ending");
		softAssert.assertAll();
	}

}
