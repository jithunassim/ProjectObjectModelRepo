package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityClass;

public class DatePickerPage 
{
WebDriver driver;
@FindBy(xpath = "//a[contains(text(),'Date Pickers')]")
WebElement datepicker;

@FindBy(xpath = "//input[@id='single-input-field']")
WebElement enterdatefield;

@FindBy(xpath = "(//table[@class='table-condensed'])[1]//tbody//tr[2]//td[5]")
WebElement date1;
@FindBy(xpath = "(//table[@class='table-condensed']//tr[2]//th[2])[1]")
WebElement monthelement;

@FindBy(xpath = " (//table[@class='table-condensed']//tr[2]//th[1])[1]")
WebElement previousbutton;

@FindBy(xpath = " (//table[@class='table-condensed']//tr[2]//th[3])[1]")
WebElement nextbutton;

public DatePickerPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void click_ondatePicker()
{
	datepicker.click();
}
public String check_enterdatefield()
{
	enterdatefield.click();
	date1.click();
	return enterdatefield.getText();
}
public String check_attribute()
{
	UtilityClass utilityclass;//UtilityClass utilityclass=new UtilityClass();
	utilityclass=new UtilityClass();
	String attribute=utilityclass.get_attribute(datepicker,"href");
return attribute;
}
public void selectdate()
{
	enterdatefield.click();
	String date="16-12-2023";
	String arr[]=date.split("-");
	String dayindex=arr[0];
	String monthindex=arr[1];
	String yearindex=arr[2];
	int m=Integer.parseInt(monthindex);
	int y=Integer.parseInt(yearindex);
	String month="";
	switch (m) 
	{
	case 01:
		month = "January";
		break;
	case 2:
		month = "February";
		break;
	case 3:
		month = "March";
		break;
	case 4:
		month = "April";
		break;
	case 5:
		month = "May";
		break;
	case 6:
		month = "June";
		break;
	case 7:
		month = "July";
		break;
	case 8:
		month = "August";
		break;
	case 9:
		month = "September";
		break;
	case 10:
		month = "October";
		break;
	case 11:
		month = "November";
		break;
	case 12:
		month = "December";
	
}
	String month_year=month+" "+yearindex;
	while(true)
	{
		String actualdate=monthelement.getText();
		if(month_year.equals(actualdate))
		{
			break;
		}
		else if(m<12&&y<=2023)
		{
			previousbutton.click();
		}
		else
		{
			nextbutton.click();
		}
		
	}
	WebElement element=driver.findElement(By.xpath("//td[text()='"+dayindex+"' and @class='day']"));
	element.click();
}
}
