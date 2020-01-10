package ActiTime;

import org.testng.annotations.Test;

public class SampleTest {

     @Test(priority=1)
     private void createcustomerTest() {
     System.out.println("execute HDFC createcustomerTest");
     }
     @Test(priority=2)
     private void modifycustonerTest() {
     System.out.println("execute HDFC modifycustomerTest");
     }
     @Test(priority=3)
     private void deletecustomerTest() {
     System.out.println("execute HDFC deletecustomerTest");
     
     }
}
    	
	
