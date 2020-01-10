package ActiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverProject {

	public static void main(String[] args) {
     FirefoxDriver driver = new FirefoxDriver();
	  driver.get("http://localhost/login.do");
	  //login
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("manager");
	 // driver.findElement(By.XPath(" ")

	}

}
