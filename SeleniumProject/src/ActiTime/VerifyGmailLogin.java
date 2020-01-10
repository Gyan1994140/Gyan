package ActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyGmailLogin {

	public static void main(String[] args) {
		
       WebDriver driver = new ChromeDriver();
       
       driver.manage().window().maximize();
       
       driver.get("https://www.gmail.com");
       
       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
       
       
       driver.findElement(By.id("identifierId")).sendKeys("tigergyana1994@gmail.com");
       
     
       driver.findElement(By.xpath("//span[text()='Next']")).click();
       
    
       driver.findElement(By.name("password")).sendKeys("TIGER@368");
       
       driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}