package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
private WebElement logoutprof;
@FindBy(xpath="//a[text()='Logout']")
private WebElement logoutbtn;

@FindBy(xpath="//span[text()='PIM']")
private WebElement pim_btn;
@FindBy(xpath="//a[text()='Add Employee']")
private WebElement addemp_btn;

@FindBy(xpath="//input[@name='firstName']")
private WebElement fntf;

@FindBy(xpath="//input[@name='lastName']")
private WebElement lntf;

@FindBy(xpath="//button[@type='submit']")
private WebElement save_btn;

public Homepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement logoutprof()
{
	return logoutprof ;
}
public WebElement logoutbtn()
{
	return logoutbtn ;
}


public WebElement pim_btn()
{
	return pim_btn ;
}
public WebElement addemp_btn()
{
	return addemp_btn ;
}
public WebElement fntf()
{
	return fntf ;
}

public WebElement lntf()
{
	return lntf ;
}
public WebElement save_btn()
{
	return save_btn ;
}


}