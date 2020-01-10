
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
   /*Global object*/
	public static WebDriver driver;
	FileLib fl = new FileLib();
     @BeforeClass
     public void launchbrowser()
     {
      String browser = fl.propertykeyvalue("BROWSER");
      if(browser.equals("chrome"))
      {
    	  driver = new ChromeDriver();
      }
      if(browser.equals("FireFox"))
      {
    	  driver = new FirefoxDriver();
      }
      if(browser.equals("IE"))
      {
    	  driver = new InternetExplorerDriver();
      }
      
	}

}
