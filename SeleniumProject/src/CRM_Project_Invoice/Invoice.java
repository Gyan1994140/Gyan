package CRM_Project_Invoice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Invoice {

	public static void main(String[] args) {
     WebDriver driver = new FirefoxDriver();
     driver.get("http://localhost:8888/");
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     //login
    driver.findElement(By.name("user_name")).sendKeys("admin");
    driver.findElement(By.name("user_password")).sendKeys("manager");
    driver.findElement(By.id("submitButton")).click();
    WebElement wb = driver.findElement(By.xpath("//a[text()='More']"));
    Actions act = new Actions(driver);
    act.moveToElement(wb).perform();
    //Go to workflow list
    WebDriverWait wait = new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Invoice']")));
    driver.findElement(By.xpath("//a[text()='Invoice']")).click();
    driver.findElement(By.xpath("//img[@title=\"Create Invoice...\"]")).click();
    driver.findElement(By.xpath("//a[text()='Products']")).click();
    driver.findElement(By.xpath("//")).click();
    
	}

}
