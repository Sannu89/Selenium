package login;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtility.Baseclass;

public class TC_01_Test extends Baseclass
{
	@Test
		
	public void tc()
		{
		login.getLoginLink().click();
		Reporter.log("for demo");
		login.getEmailTF().sendKeys("sneha@gmail.com");
		login.getPasswodTF().sendKeys("123456789");
		login.getLoginButton().click();
		}
	
	}

