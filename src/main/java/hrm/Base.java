package hrm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	WebDriver driver;
	Properties properties;
	
	public WebDriver initializeDriver()
	{
		 properties = new Properties();
		File file = new File("E:\\workspace\\Selenium730830\\hrm\\src\\main\\resources\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			try {
				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String browser = properties.getProperty("browser");
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\test\\resources\\executables\\chromedriver.exe");
			 driver = new ChromeDriver();
			
			
		}
		else if(browser.equals("firefox"))
		{
			
		}
		
		else if(browser.equals("IE"))
		{
			
		}
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
		
		
	}

}
