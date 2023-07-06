package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
	private WebElement RegisterLink;

	@FindBy(id = "FirstName")
	private WebElement firstnameTF;

	@FindBy(id = "LastName")
	private WebElement lastnameTF;

	@FindBy(id = "Email")
	private WebElement EmailTF;

	@FindBy(id = "Password")
	private WebElement PasswordTF;

	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpwd;

	@FindBy(name = "register-button")
	private WebElement registerButton;

	/**
	 * @return the registerLink
	 */
	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	/**
	 * @return the firstnameTF
	 */
	public WebElement getFirstnameTF() {
		return firstnameTF;
	}

	/**
	 * @return the lastnameTF
	 */
	public WebElement getLastnameTF() {
		return lastnameTF;
	}

	/**
	 * @return the emailTF
	 */
	public WebElement getEmailTF() {
		return EmailTF;
	}

	/**
	 * @return the passwordTF
	 */
	public WebElement getPasswordTF() {
		return PasswordTF;
	}

	/**
	 * @return the confirmpwd
	 */
	public WebElement getConfirmpwd() {
		return confirmpwd;
	}

	/**
	 * @return the registerButton
	 */
	public WebElement getRegisterButton() {
		return registerButton;
	}


}
