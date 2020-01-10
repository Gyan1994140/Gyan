package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumPractice {

	public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    driver.get("https;//gmail.com");
    //login:
    driver.findElement(By.id("identifierID")).sendKeys("seleniumoar1234");
    driver.findElement(By.xpath("//span[text()=next]")).click();
    //wait for password-Element to be active & click in GUI:
    WebDriverWait wait = new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='next']")));
    
	}

}
