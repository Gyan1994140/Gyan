package ActiTime;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationMethod {

	public static void main(String[] args) {
	 FirefoxDriver driver = new FirefoxDriver();
	 driver.navigate().to("https://www.amazon.com/");
	 driver.findElement(By.partialLinkText("Gift Ideas")).click();
	 // click on browser Back button
	 driver.navigate().back();
	 //click on browser Forward button
	 driver.navigate().forward();
	 driver.navigate().refresh();
	 
	}

}
