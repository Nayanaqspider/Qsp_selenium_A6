package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BaseScript;

public class My_informaton extends BaseScript
{
	@FindBy(xpath="//span[text()='My Info']")
	private WebElement myinfo_link ;
	public My_informaton(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		}
	
	/*public WebElement clk_myinfo_link()
	{
		return myinfo_link;
	}*/
	//or
	public void clk_myinfo_link()
	{
		ew.until(ExpectedConditions.elementToBeClickable(hm.addemp_btn()));//not returning anything in test case2(tc2) of testcase script i'm 
		//calling directly method so here only i mentioned explicit wait
		myinfo_link.click();
	}
}
