package hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends Base {
	
	@BeforeMethod
	public void setUp()
	{
		driver = initializeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}
	
	@Test
	public void verifyLogin()
	{
		
		
		LoginPage lp = new LoginPage(driver);
		lp.username.sendKeys("Admin");
		lp.password.sendKeys("admin123");
		lp.login().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	
	}
	
	@Test
	public void verifyForgetPasswordLink()
	{
		LoginPage lp = new LoginPage(driver);
		lp.forgotPassword().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
