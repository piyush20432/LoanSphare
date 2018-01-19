package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static
	{	
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	}
static WebDriver driver =new ChromeDriver();

//driver.manage().timeouts().implicitlywait(10, timeUnit.seconds);

// WebDriverWait wait =new WebDriverWait(driver, 20);
//
}


