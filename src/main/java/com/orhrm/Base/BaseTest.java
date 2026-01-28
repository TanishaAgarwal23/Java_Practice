package com.orhrm.Base;
 
import java.time.Duration;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class BaseTest {
 
	protected WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() {
		  System.out.println("This is Before Method");
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
 
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("This is After Method");
		  driver.quit();
	  }
}
 