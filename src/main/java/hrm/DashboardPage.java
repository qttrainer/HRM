package hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
WebDriver driver ;
	
	public DashboardPage(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//b[text() = 'PIM']")
	WebElement pim;
	
	public WebElement pim()
	{
		return pim;
	}
	
	

}
