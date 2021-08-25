package hrm;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PIMPageTest extends Base {
	
	@BeforeMethod
	public void setUp()
	{
		driver = initializeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}
	
	@Test
	public void addEmployee()
	{
		LoginPage lp = new LoginPage(driver);
		lp.username.sendKeys("Admin");
		lp.password.sendKeys("admin123");
		lp.login().click();
		DashboardPage dbp = new DashboardPage(driver);
		dbp.pim().click();
		PIMPage pim = new PIMPage(driver);
		pim.addEmployee().click();
		pim.firstName().sendKeys("Ashutosh");
		pim.lastName().sendKeys("Upadhyay");
		pim.SaveButton().click();
		Assert.assertEquals(pim.personalDetails().getText(), "Personal Details");
		
	}
	
	

	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	

}
