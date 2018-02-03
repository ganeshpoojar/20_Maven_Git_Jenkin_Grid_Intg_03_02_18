package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
  @Test
  public void Demo() {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com");
	  driver.quit();
  }
}
