//program not complete

package rajesh.AutoITDemo02;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoITDemo02 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Selenium\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cloudconvert.com/jpg-to-png");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.findElement(By.cssSelector("button[class*='primary']:nth-child(1)")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\Java Selenium\\AutoIT\\AutoITDemo02.exe");
//		Runtime.getRuntime().exec("D:\\Java Selenium\\AutoIT\\AutoITDemo01.exe");
		
	}

}
