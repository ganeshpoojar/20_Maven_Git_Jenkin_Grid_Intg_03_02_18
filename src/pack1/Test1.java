package pack1;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
	
	public Logger log;
	public  ChromeDriver driver;
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@BeforeClass
	public void log4j(){
	Logger.getLogger(getClass());			  
	}
	
	
	@Test
	public void Demo() {	
	  log.setLevel(Level.INFO);	 	  
	  new ChromeDriver();
	  driver.get("http://www.google.com");  	 
	  log.info("Hello");
	  driver.quit();
  }
}
