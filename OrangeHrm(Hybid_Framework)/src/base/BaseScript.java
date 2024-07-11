package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pageObjects.Homepage;
import pageObjects.Login_Repository;
import pageObjects.My_informaton;

public class BaseScript implements applicationConstants//this class should be generic and not hard coding
{
	public static WebDriver driver;
	public ReadProperties rp1;
	public Homepage hm;
	public Login_Repository lr;
	public My_informaton mi;
	public WebDriverWait ew;
	@BeforeClass
	public void launchBrwoser() throws IOException
	{
		System.setProperty(chrom_key, chrom_value);
		driver=new ChromeDriver();
		rp1 = new ReadProperties();
		ew= new WebDriverWait(driver, 10);
		lr=new Login_Repository(driver);// all add objects in before class
		hm=new Homepage(driver);//all add objects in before class
		mi=new My_informaton(driver);
		
		driver.get(rp1.m1());
		//driver.get(ReadProperties.pro.m1());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
		
	@BeforeMethod
	public void loginpage()
	{
		ew.until(ExpectedConditions.visibilityOf(lr.usntf()));//element is visible //explicit wait condition 
		lr.usntf().sendKeys(rp1.m2());
		ew.until(ExpectedConditions.visibilityOf(lr.pswtf()));//element is visible
		lr.pswtf().sendKeys(rp1.m3());
		ew.until(ExpectedConditions.elementToBeClickable(lr.loginbtn()));//element is visible
		lr.loginbtn().click();
		
	}
	//test annotation will execute here or testcase script will execute
	@AfterMethod
	public void logout(ITestResult result)
	{
			if(result.FAILURE==result.getStatus())
			{
				CaptureDefects.Getdefect(result.getName());//capturing defects before logout
			}
		ew.until(ExpectedConditions.elementToBeClickable(hm.logoutprof()));
		hm.logoutprof().click();
		ew.until(ExpectedConditions.elementToBeClickable(hm.logoutbtn()));
		hm.logoutbtn().click();
	}
	@AfterClass
	public void closeBrwoser()
	{
		driver.close();
		System.out.println("close");
	}
	
}
