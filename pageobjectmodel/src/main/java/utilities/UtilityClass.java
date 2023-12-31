package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class UtilityClass
{
	//to get attributes
public String get_attribute(WebElement element,String attribute)
{
	return element.getAttribute(attribute);
}
//to get list of text
public List<String> gettextOfElements(List<WebElement> elements)
{
	List<String>data=new ArrayList<String>();
	for(WebElement element:elements)
	{
		data.add(element.getText());
	}
	return data;
}
}
