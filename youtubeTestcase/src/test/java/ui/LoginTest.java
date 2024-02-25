package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    public static String browser = "chrome"; // Browser name can be read from .xsl .csv file
    public static WebDriver driver=null;

    public static void main(String[] args) {
    	switch (browser) {
        case "chrome":
        	WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            break;
        case "firefox":
        	WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            break;
        case "edge":
        	WebDriverManager.edgedriver().setup();
        	EdgeOptions options=new EdgeOptions();
        	options.addArguments("--remote-allow-origins=*");
            driver = new EdgeDriver(options);
          break;
        default:
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


/*WebDriverManager.edgedriver().setup(); - This line sets up the EdgeDriver using the WebDriverManager. It will download and manage the EdgeDriver binary automatically.
EdgeOptions options = new EdgeOptions(); - This line creates an instance of the EdgeOptions class, which is used to set the options for the EdgeDriver.
options.addArguments("--remote-allow-origins=*"); - This line adds the --remote-allow-origins=* argument to the EdgeOptions. This argument allows the EdgeDriver to connect to a remote server with any origin.
driver = new EdgeDriver(options); - This line creates a new instance of the EdgeDriver with the specified options.
If you want to set the --remote-allow-origins argument to a specific value instead of *, you can replace "--remote-allow-origins=*" with "--remote-allow-origins=<your-specific-value>".
Here is an example:
WebDriverManager.edgedriver().setup();
EdgeOptions options = new EdgeOptions();
options.addArguments("--remote-allow-origins=http://localhost:8080");
driver = new EdgeDriver(options);
This code sets the --remote-allow-origins argument to http://localhost:8080, which means that the EdgeDriver can only connect to a remote server with the origin http://localhost:8080.
*/