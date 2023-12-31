package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityClass;

public class ListBoxPage 
{
WebDriver driver;
@FindBy(xpath = "//a[@id='list0box']") 
WebElement listbox;


@FindBy(xpath = "//a[contains(text(),'Jquery List Box')]") 
WebElement jQueryListbox;

@FindBy(xpath = "(//select)[1]//option") 
List<WebElement> nameElement;

@FindBy(xpath = "//button[@id='button']") 
WebElement selected;


public ListBoxPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void click_on_jquery_listBox()
{
	listbox.click();
	jQueryListbox.click();
}
public void printAllNames() 
{
	List<String> names=new ArrayList<String>();
	UtilityClass utilityclass;
	utilityclass=new UtilityClass();
	names=utilityclass.gettextOfElements(nameElement);
	System.out.println(names);
	
}
public void check_alert_selected() throws InterruptedException
{
	selected.click();
	Thread.sleep(2000);
	String alertmsg=driver.switchTo().alert().getText();
	System.out.println("alert msg is:"+ alertmsg);
	driver.switchTo().alert().accept();
	
}

}
