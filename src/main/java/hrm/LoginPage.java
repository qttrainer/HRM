package hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	
	WebDriver driver ;
	
	public LoginPage(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//By username =By.name("txtUsername");
	
	@FindBy(name = "txtUsername")
	WebElement username;
	
//	By password = By.id("txtPassword");
	
	@FindBy(id = "txtPassword")
	WebElement password;
	
	@FindBy(xpath = "//a[text() = 'Forgot your password?']")
	WebElement forgotPassword;
	
	By login = By.id("btnLogin");
	
	public WebElement userName()
	{
		
		return username;
	}
	
	
	public WebElement password()
	{
		return password;
		
	}
	
	
	public WebElement login()
	{
		return driver.findElement(login);	
	}
	
	public WebElement forgotPassword()
	{
		return forgotPassword;
	}
	

}
