package ActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VtigerQuote {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
	 // Login
	 driver.findElement(By.name("user_name")).sendKeys("admin");
	 driver.findElement(By.name("user_password")).sendKeys("manager");
	 driver.findElement(By.id("submitButton")).click();
     //Go to more
	  WebElement wb=driver.findElement(By.xpath("//a[text()='More']"));
	  Actions ac=new Actions(driver);
	  ac.moveToElement(wb).perform();
	  WebDriverWait Wait=new WebDriverWait(driver,20);
	  Wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Vendors")));
	  //Go to Vender
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Vendors")).click();
	  driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	  driver.findElement(By.name("vendorname")).sendKeys("Toshiba",Keys.ENTER);
	  //driver.findElement(By.xpath("//input[@class='CRM button small save']")).click();
	  driver.findElement(By.xpath("//a[text()='Products']")).click();
	  driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
	  driver.findElement(By.name("productname")).sendKeys("QLaptop");
      driver.findElement(By.id("unit_price")).sendKeys("2000");
      driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
      driver.findElement(By.xpath("//a[text()='Organizations']")).click();
      driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
      driver.findElement(By.name("accountname")).sendKeys("deepak");
      driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//a[text='Contacts']")).click();
	  driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
      driver.findElement(By.name("firstname")).sendKeys("deepak");
      
      
	  }
	

}