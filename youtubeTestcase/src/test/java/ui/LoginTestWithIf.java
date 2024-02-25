package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithIf {
	public static String browser = "chrome"; // Browser name can be read from .xsl .csv file
	public static WebDriver driver = null;

	public static void main(String[] args) {
    	if(browser.equals("chrome")){
        	WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
    	}
    	else if(browser.equals("firefox")){
        	WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
    	}
    	else if(browser.equals("edge")){
        	WebDriverManager.edgedriver().setup();
        	EdgeOptions options=new EdgeOptions();
        	options.addArguments("--remote-allow-origins=*");
            driver = new EdgeDriver(options);
    	}
        else {
        	System.out.println("Invalid browser selection. Please choose Chrome, Firefox, or Edge.");
            System.exit(0);
		}
    	
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Use Thread.sleep for waiting instead of driver.manage().wait
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit(); // Use quit() to close the browser
    }
}
