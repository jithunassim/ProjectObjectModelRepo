package testes;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.DatePickerPage;

public class DatePickerTest extends BaseClass
{
	DatePickerPage datepickerpage;
	@Test
	public void verify_clickOn_datepicker()
	{
		datepickerpage=new DatePickerPage(driver);
		datepickerpage.click_ondatePicker();
		//using utilityclass
		String printattribute=datepickerpage.check_attribute();
		System.out.println(printattribute);
		
		
	}
	@Test
	public void verify_ToChooseDate()
	{
		datepickerpage=new DatePickerPage(driver);
		datepickerpage.click_ondatePicker();
		//String d=datepickerpage.check_enterdatefield();
		//System.out.println(d);
		datepickerpage.selectdate();
		
		
	}
}
