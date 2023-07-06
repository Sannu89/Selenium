package genericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;
import objectRepository.RegisterPage;
@Test
public class Baseclass
{
	public static WebDriver driver;
	PropertyUtility ppt=new PropertyUtility();
    public RegisterPage register;
	public LoginPage login;
	@BeforeClass
	public void LaunchingBrowser() throws IOException
	{
		if(ppt.readingDataFromPPt("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(ppt.readingDataFromPPt("url"));
		
		register=new RegisterPage(driver);
		login=new LoginPage(driver);
	}
	@AfterClass
	public void teardownTheBrowser()
	{
		driver.quit();
	}
}

