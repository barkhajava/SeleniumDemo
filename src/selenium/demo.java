package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\H&B\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("barkhajava@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful");
		}
		else
		{
			System.out.println("Test failure");
		}
	}
}
