package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browserfactory {

	static WebDriver driver;

	static String url = "http://techfios.com/test/101";
	//@FindBy(how = How.NAME,using ="allbox")WebElement Toggle_All ;
	
	public static WebDriver init() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\16462\\July2021_selenium\\TestNg2\\drivers\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;

	}
	
		
		 public static void tearDown() {
		 driver.close();
		 driver.quit();

	}

}
