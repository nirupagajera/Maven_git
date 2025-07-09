package git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Open {
		
	public WebDriver driver;
	
	@Test(priority = 1)
	public void browser_open() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://krishaweb.com/");
		
		driver.findElement(By.linkText("Contact Us")).click();
			
	}
}
