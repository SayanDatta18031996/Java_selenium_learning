package com.myproject.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties Config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fisConfig;
	public static FileInputStream fisOR;
	public static Logger log = LogManager.getLogger(TestBase.class.getName());

	@BeforeSuite
	public void setUp() {
		if (driver == null) {
			try {
				fisConfig = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {
				fisOR = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				Config.load(fisConfig);
				log.debug("Config file loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fisOR);
				log.debug("OR file loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (Config.getProperty("browser").equals("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				log.debug("Chrome launched");
			} else if (Config.getProperty("browser").equals("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (Config.getProperty("browser").equals("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}

			driver.get(Config.getProperty("testsiteurl"));
			log.debug("Nevigated to " + Config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(Duration.ofSeconds(Long.parseLong((Config.getProperty("implicitly.wait")))));
		}
	}

	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
		log.debug("Test Execution completed");
	}
}
