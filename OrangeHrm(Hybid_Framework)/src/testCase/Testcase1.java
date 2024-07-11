package testCase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseScript;
import base.ReadExcel;
import utilityobjects.Dropdown;

public class Testcase1 extends BaseScript
{
@Test
public void tc1() throws EncryptedDocumentException, IOException//Add_employee feature method
{
	ew.until(ExpectedConditions.elementToBeClickable(hm.pim_btn()));
	hm.pim_btn().click();
	ew.until(ExpectedConditions.elementToBeClickable(hm.addemp_btn()));
	hm.addemp_btn().click();
	//String fn = ReadExcel.readData("sheet1", 0, 0);
	ew.until(ExpectedConditions.visibilityOf(hm.fntf()));
	hm.fntf().sendKeys(ReadExcel.readData("sheet1", 0, 0));//pass fn
	ew.until(ExpectedConditions.visibilityOf(hm.lntf()));
	hm.lntf().sendKeys(ReadExcel.readData("sheet1", 0, 1));
	ew.until(ExpectedConditions.elementToBeClickable(hm.save_btn()));
	hm.save_btn().click();
	System.out.println("click pim");
	
	
}
@Test
public void tc2()
{
	mi.clk_myinfo_link();
	Assert.fail();
	//Dropdown.selectoptions();
	
}
}
