package jen;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class YahooTest{
	
	@Test
	public void testGoogle(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://yahoo.com");
		
		driver.quit();
	}
  
}
