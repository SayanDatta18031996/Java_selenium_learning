//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
 

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","D:\\Education\\Code\\eclips_workspace\\YouTube\\jars\\chromedriver.exe");
		//-- This lines is to reslove if bowser is not found by default. Here I use for firefox only--
		System.setProperty("webdriver.gecko.driver", "D:\\Education\\Code\\browserdrivers\\geckodriver\\geckodriver.exe");
		DesiredCapabilities capabilities= new DesiredCapabilities();
		FirefoxOptions options=new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
		FirefoxDriver firefoxDriver=new FirefoxDriver(options);
		//--- End of firefox
		//System.setProperty("webdriver.edge.driver","D:\\Education\\Code\\eclips_workspace\\YouTube\\jars\\msedgedriver.exe");
		//ChromeDriver driver= new ChromeDriver();
		//EdgeDriver edgeDriver=new EdgeDriver();
		//edgeDriver.get("https://www.geeksforgeeks.org");
		firefoxDriver.get("https://www.geeksforgeeks.org");

	}

}
