package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement aboveElement = driver
//				.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
//		aboveElement.sendKeys("dattasayanbca@gmail.com");
//
//		WebElement belowElement = driver
//				.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select")));
//		belowElement.sendKeys("kolkata");
//
//		WebElement nearElement = driver
//				.findElement(RelativeLocator.with(By.partialLinkText("THE")).near(By.linkText("Signin")));
//		nearElement.click();
//		
//		WebElement rightOfElement=driver.findElement(RelativeLocator.with(By.xpath("//label[contains(text(),\"Username\")]")).toRightOf(By.xpath("")));
	
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.linkText("Signin")).below(By.xpath("//div[@id='load_box']//input[@name='username']"))).sendKeys("selector chaining");
	}
	
}
