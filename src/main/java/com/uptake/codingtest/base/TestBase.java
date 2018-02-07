package com.uptake.codingtest.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.uptake.codingtest.util.TestUtil;

public class TestBase {

	 public static WebDriver driver;
	public static Properties prop;

	// To load & read the config properties file
	public TestBase() {
		try {
		prop = new Properties();
		File f = new File(System.getProperty("user.dir")+ "\\src\\main\\java\\com\\uptake\\codingtest\\config\\config.properties");
		FileReader obj = new FileReader(f);
			prop.load(obj);
			System.out.println("inside super constructor");
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/*
	public void readData() throws IOException {
		prop = new Properties();
		File f = new File(System.getProperty("user.dir") + "\\src\\main\\java\\com\\uptake\\codingtest\\config\\config.properties");
		FileReader obj = new FileReader(f);
		prop.load(obj);
	}
	*/

	public void initialization() {
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\SelAuto\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
	//		readData();
	//		TestBase();
			System.out.println(prop.getProperty("url"));
			driver.get(prop.getProperty("url"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
