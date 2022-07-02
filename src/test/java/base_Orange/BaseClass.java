package base_Orange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public static void loadDriver() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 }
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	public static void click(By by) {
		driver.findElement(by).click();
	}
	
	public static void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	/*public static void selectDate() {
		
		Date d = new Date(1);
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
		String date = formatter.format(d);
		String splitter[]=date.split("-");
		String month_year = splitter[1];
		String day = splitter[0];
		System.out.println(month_year);
		System.out.println(day);
		
		selectDate(month_year,day);
		Thread.sleep(3000);*/
			//}
}