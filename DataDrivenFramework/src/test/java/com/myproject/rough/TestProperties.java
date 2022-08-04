package com.myproject.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		// System.out.println(System.getProperty("user.dir")); It will give the project
		// directory path
		Properties Config = new Properties();
		Properties OR = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
		FileInputStream fisOR = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
		Config.load(fis);
		OR.load(fisOR);
		System.out.println(Config.getProperty("browser"));
		System.out.println(OR.getProperty("bmlBtn"));
		fis.close();
	}
}
