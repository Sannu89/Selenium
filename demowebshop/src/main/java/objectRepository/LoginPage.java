package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	@FindBy(id = "Email")
	private WebElement EmailTF;

	@FindBy(id = "Password")
	private WebElement PasswodTF;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	/**
	 * @return the loginLink
	 */
	public WebElement getLoginLink() {
		return loginLink;
	}

	/**
	 * @return the emailTF
	 */
	public WebElement getEmailTF() {
		return EmailTF;
	}

	/**
	 * @return the passwodTF
	 */
	public WebElement getPasswodTF() {
		return PasswodTF;
	}

	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return loginButton;
	}

}
