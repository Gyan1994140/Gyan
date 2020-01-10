package ActiTime;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowMethod {

	public static void main(String[] args) {
     FirefoxDriver driver = new FirefoxDriver();
     driver.navigate().to("https://www.amazon.com/");
     // change the size of the browser window
     Dimension dem = new Dimension(100,200);
     driver.manage().window().setSize(dem);
     //maximize the Browser window
     driver.manage().window().maximize();
      //Delete all the Browser data
     driver.manage().deleteAllCookies();
     //one active window will get closed
      driver.close();
      
     
	}

}
