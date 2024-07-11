package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Repository 
{
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement usntf;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement pswtf;
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginbtn;
	public Login_Repository(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement usntf()
	{
		return usntf;
	}
	public WebElement pswtf()
	{
		return pswtf;
	}
	public WebElement loginbtn()
	{
		return loginbtn;
	}
	
	
	
}
