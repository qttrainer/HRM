package hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage  {
	
	public WebDriver driver;
	
	public PIMPage(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text() ='Add Employee']")
	WebElement addEmployee;
	
	@FindBy(id = "firstName")
	WebElement firstName;
	
	@FindBy(id = "lastName")
	WebElement lastName;
	
	//btnSave
	
	@FindBy(id = "btnSave")
	WebElement SaveButton;
	
	@FindBy(xpath = "//h1[text() = 'Personal Details']")
	private WebElement personalDetails;
	
	public WebElement personalDetails()
	{
		return personalDetails;
	}
	
	public WebElement addEmployee()
	{
		return addEmployee;
	}
	
	
	public WebElement firstName()
	{
		return firstName;
	}
	
	//lastName
	
	public WebElement lastName()
	{
		return lastName;
	}
	
	
	public WebElement SaveButton()
	{
		return SaveButton;
	}
	
	

}
