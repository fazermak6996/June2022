package adactinhotelapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_AdactinHotelApp {
	
	static WebDriver driver;
	
	public static void browser() {
	System.getProperty("webdriver.chrome.driver", "C:\\Users\\fazer\\.eclipse\\maven\\SampleMaven\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	public static void getUrl(String url) {
	driver.get(url);
	}
	
	public static void clickFunction(By by) {
		driver.findElement(by).click();
	}
	
	public static void findElement(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}
	
	public static void implicitWait(long value) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(value));
	}
}
