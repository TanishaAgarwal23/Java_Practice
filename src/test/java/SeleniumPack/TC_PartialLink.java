package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_PartialLink {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
				WebDriverManager.edgedriver().setup();
				WebDriver driver=new EdgeDriver();
				driver.get("https://tutorialsninja.com/demo/index.php?");
				driver.findElement(By.partialLinkText("Account")).click();
				driver.findElement(By.partialLinkText("Regist")).click();
				driver.findElement(By.cssSelector("input#input-firstname")).clear();
				driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
				driver.close();
		 
	}
}
