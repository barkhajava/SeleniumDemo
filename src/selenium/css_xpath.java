package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_xpath {
public static void main (String [] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\H&B\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://ebay.com");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.findElement(By.cssSelector("#gh-ac")).sendKeys("OnePlus");
	driver.findElement(By.cssSelector("#gh-btn")).click();
	driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Apple");
	driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	js.executeScript("window.scrollBy(0,300)");
}
}
