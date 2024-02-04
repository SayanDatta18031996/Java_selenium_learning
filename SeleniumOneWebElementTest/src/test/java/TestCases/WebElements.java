package TestCases;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("amibongbabu@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		// Fluent wait is better than other waits. In fluent wait driver doesn't check
		// for the element n number of times which is not present in the web page at the
		// moment.It will check the element in a gap of time which is mentioned in the
		// polling every.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		// Implicitly wait will wait till 10 seconds web element to be appear in the web
		// page. If web element comes before 10 seconds it will execute else if 10 seconds
		// surpass and web element doen't appear in the web page Selenium will through
		// an exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// WebDriverWait wait.until will will wait till the web element is
		// actionable.Once it become clickable then send keys.
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath"))).sendKeys("text");
		driver.quit();
	}
}
