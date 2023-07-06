package login;


import org.testng.annotations.Test;

import genericUtility.Baseclass;

public class TC_02_Test extends Baseclass
{
	@Test
	public void RegisteringUser()
	{
		register.getRegisterLink().click();
		register.getFirstnameTF().sendKeys("sahana");
		register.getLastnameTF().sendKeys("s");
		register.getEmailTF().sendKeys("sahana@gmail.com");
		register.getPasswordTF().sendKeys("12345678");
		register.getConfirmpwd().sendKeys("12345678");
		register.getRegisterButton().click();

	}

}
