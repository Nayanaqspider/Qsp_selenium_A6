package utilityobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
public /*static*/ void selectoptions(WebElement element,Object Data)
{
	Select so = Objects.Dropdown(element);
	if(Data instanceof Integer)
	{
		so.selectByIndex((Integer) Data);
	}
	else if(Data instanceof String)
	{
		try {
		so.selectByVisibleText((String)Data);
	}
	catch(Exception e)
	{
		so.selectByValue((String)Data);
	}
	}
}
public void deselect(WebElement element)
{
	Select dso = Objects.Dropdown(element);
	dso.deselectAll();
}
}
