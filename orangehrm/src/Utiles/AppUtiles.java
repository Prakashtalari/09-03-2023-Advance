package Utiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppUtiles
{
   public static WebDriver driver;
	
	public static void LaunchApp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
	}

	public static void closeapp()
	{
		driver.close();
		
	}
	
	
	
	
	
	
}
