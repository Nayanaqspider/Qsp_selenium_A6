package utilityobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Executor 
{
public static void Clickaction(WebDriver driver,WebElement element)
{
Objects.JSE(driver).executeScript("arguments[0].click();", element);
}
public static void Scrollactions(WebDriver driver,WebElement element)
{
Objects.JSE(driver).executeScript("arguments[0].scrollIntoView();", element);
}
public static void Passdata(WebDriver driver,WebElement element,String data)
{
Objects.JSE(driver).executeScript("arguments[0].value='"+data+"'", element);
}
}
