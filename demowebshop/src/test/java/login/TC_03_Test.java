package login;

import org.testng.annotations.Test;

import genericUtility.Baseclass;

public class TC_03_Test extends Baseclass{
	@Test
	public void LoginWith()
	{
	  login.getLoginLink().click();
	  login.getEmailTF().sendKeys("sahana@gmail.com");
	  login.getPasswodTF().sendKeys("12345678");
	  login.getLoginButton().click();
	}

}
