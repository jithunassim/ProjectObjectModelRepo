package testes;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.InputFormPage;

public class InputFormTest extends BaseClass
{
InputFormPage inputformpage;
@Test

	public void verify_message()
	{
		inputformpage=new InputFormPage(driver);
		inputformpage.clickinputform();
		
	}
@Test
public void verify_showButton()
{
	inputformpage=new InputFormPage(driver);
	inputformpage.clickinputform();
	String expectedshowbutton_text="Show Message";
	String actualtext=inputformpage.getshowbutton_text();
	Assert.assertEquals(actualtext, expectedshowbutton_text);
}
@Test
public void verify_click_datepickers()
{
	 inputformpage=new InputFormPage(driver);
	 inputformpage.clickinputform();
	 inputformpage.clickon_datepicker();
}
}

