package TestCases;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SetupBrowsers {
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Education\\Code\\browserdrivers\\chromedriver\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		
		//-- This lines is to reslove if bowser is not found by default. Here I use for firefox only--
		System.setProperty("webdriver.gecko.driver", "D:\\Education\\Code\\browserdrivers\\geckodriver\\geckodriver.exe");
		DesiredCapabilities capabilities= new DesiredCapabilities();
		FirefoxOptions options=new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
		FirefoxDriver driver=new FirefoxDriver(options);
		//--- End of firefox
		//System.setProperty("webdriver.edge.driver", "D:\\Education\\Code\\browserdrivers\\edgedriver\\msedgedriver.exe");
		//EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.way2automation.com");
	}

}
