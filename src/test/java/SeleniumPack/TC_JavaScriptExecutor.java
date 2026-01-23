package SeleniumPack;
 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class TC_JavaScriptExecutor {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("alert('Hello from selenium');");
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		js.executeScript("window.scrollBy(0,900)");
	}
 
}
 
 