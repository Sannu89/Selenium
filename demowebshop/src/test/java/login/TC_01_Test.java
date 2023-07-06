package login;

import org.testng.annotations.Test;

import genericUtility.Baseclass;

public class TC_01_Test extends Baseclass
{
	@Test
		
	public void tc()
		{
		login.getLoginLink().click();
		login.getEmailTF().sendKeys("sneha@gmail.com");
		login.getPasswodTF().sendKeys("123456789");
		login.getLoginButton().click();
		}
	
	}

