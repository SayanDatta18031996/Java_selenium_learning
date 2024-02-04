package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BowserTest {

	public static String browser = "Edge";
	public static WebDriver driver;

	public static void main(String[] args) {

		if (browser == "Chrome") {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.way2automation.com");
			// driver.close();
			driver.quit();

		} else if (browser == "Firefox") {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.way2automation.com");
			// driver.close();
			driver.quit();

		} else if (browser == "Edge") {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://www.way2automation.com");
			// driver.close();
			driver.quit();

		}
	}

}
