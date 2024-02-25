package mavendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver chromeDriver=new ChromeDriver();
	chromeDriver.get("https://www.ebay.com/");
	chromeDriver.manage().window().maximize();
	chromeDriver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
	chromeDriver.quit();
}
}
