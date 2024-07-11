package utilityobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseActions 
{
public static void Rightclick(WebDriver driver,WebElement element)
{
Objects.Mouse(driver).contextClick(element).perform();	
}
public static void Doubleclick(WebDriver driver,WebElement element)
{
Objects.Mouse(driver).doubleClick(element).perform();	
}

public static void Draganddrop(WebDriver driver,WebElement src,WebElement dst)
{
Objects.Mouse(driver).dragAndDrop(src,dst).perform();	
}
public static void MouseHover(WebDriver driver,WebElement element)
{
Objects.Mouse(driver).moveToElement(element).perform();	
}

}
