package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityClass;

public class TablePage 
{
	UtilityClass utilityclass=new UtilityClass();
	//UtilityClass utilityclass;
	//utilityclass=new UtilityClass();
WebDriver driver;
@FindBy(xpath = "(//a[contains(text(),'Table')])[1]")
WebElement tablelink;

@FindBy(xpath ="//div[contains(text(),'Pagination')]")
WebElement tableheading;
@FindBy(xpath="//table//tbody//tr//td[1]")
List<WebElement> nameElement;

@FindBy(xpath="//table//tbody//tr[4]//td[3]")
List<WebElement> tableelement;




public TablePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void click_on_table()
{
	
	tablelink.click();
}
public String gettableHeading()
{
	return tableheading.getText();
}
public String check_attribute()//already define cheytha webelemement's attribute get cheythan use this code(utility class)
{
	//UtilityClass utilityclass;//UtilityClass utilityclass=new UtilityClass();
	//utilityclass=new UtilityClass();
	String attribute=utilityclass.get_attribute(tableheading,"class");
return attribute;
}
public void printAllNames() 
{
	List<String> names=new ArrayList<String>();
//	UtilityClass utilityclass;
	//utilityclass=new UtilityClass();
	names=utilityclass.gettextOfElements(nameElement);
	//for(String )
	
}
public String get_officeOf_person(String personName)
{
	int index=0;
	List<String> names=new ArrayList<String>();

	names=utilityclass.gettextOfElements(nameElement);
	for(index=0;index<names.size();index++)
	{
		if(personName.equals(names.get(index)))
		{
			index++;
		    break;
		}
	}
	WebElement officeelement=driver.findElement(By.xpath("//table//tbody//tr["+index+"]//td[3]"));
return officeelement.getText();
}
} 
