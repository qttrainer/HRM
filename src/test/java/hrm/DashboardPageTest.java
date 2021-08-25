package hrm;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardPageTest extends Base{
	
	@BeforeMethod
	public void setUp()
	{
		driver = initializeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}
	
	

	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	


}
