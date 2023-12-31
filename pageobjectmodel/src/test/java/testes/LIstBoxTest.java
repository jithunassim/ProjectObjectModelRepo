package testes;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.ListBoxPage;

public class LIstBoxTest extends BaseClass
{
	ListBoxPage listboxpage;
	@Test
	public void verify_click_on_jqueryListBox()
	{
		listboxpage=new ListBoxPage(driver);
		listboxpage.click_on_jquery_listBox();
		
	}
	@Test
	public void verify_GetAlloptions()
	{
		listboxpage=new ListBoxPage(driver);

		listboxpage.click_on_jquery_listBox();
		listboxpage.printAllNames();
		
		
	}
	@Test
	public void verify_alert_message_displayed() throws InterruptedException
	{
		listboxpage=new ListBoxPage(driver);

		listboxpage.click_on_jquery_listBox();
		listboxpage.check_alert_selected();
		
	}
}
