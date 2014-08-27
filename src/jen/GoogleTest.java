package jen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class GoogleTest{
	
	@Test
	public void testGoogle() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		Thread.sleep(1000L);
		//driver.findElement(By.xpath("//*[@id='body']/center/div[2]")).sendKeys("selenium");
		
		driver.quit();
	}
  
}
