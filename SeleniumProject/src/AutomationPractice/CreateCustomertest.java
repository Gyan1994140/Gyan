package AutomationPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CreateCustomertest {

	public static void main(String[] args) throws Throwable  {
	  //Step 1: create a java representation object of the physical file
		 FileInputStream fis = new FileInputStream("./data/commonndata.properties");
	  //Step 2: create an object to properties to load all the keys and values
		 Properties pobj = new Properties();
		 pobj.load(fis);
	  //step 3: By using key read all the values
		String url =  pobj.getProperty("url");
		 String username = pobj.getProperty("username");
		 String password = pobj.getProperty("password");
		 String browser = pobj.getProperty("browser");
		 System.out.println(url + "\t" + username + "\t" + password + "\t" + browser);
		 
		 WebDriver driver = null;
		 if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		 }else if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		 }else if (browser.equals("ie")) {
			driver = new InternetExplorerDriver(); 
		 }else {
			 
			 driver = new FirefoxDriver(); 
		 }
		 
		 //login
		 driver.get("url");
		 driver.findElement(By.name("username")).sendKeys("admin");
         driver.findElement(By.name("password")).sendKeys("manager");
         driver.findElement(By.id("loginButton")).click();
		 
	}

}
