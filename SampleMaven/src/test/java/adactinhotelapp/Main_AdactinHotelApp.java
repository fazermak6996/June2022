package adactinhotelapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;

public class Main_AdactinHotelApp extends Base_AdactinHotelApp{
	
	String username = "ArunKumar";
	String Password = "June2022*";
	
	public void newRegister() throws InterruptedException {
		
		clickFunction(By.linkText("New User Register Here"));
		findElement(By.xpath("//input[@id='username']"),"ArunKumar");
	}

	public static void main(String[] args) {
		Main_AdactinHotelApp sample = new Main_AdactinHotelApp();
		browser();
		getUrl("https://adactinhotelapp.com/");
		implicitWait(10);
		
	}
	}