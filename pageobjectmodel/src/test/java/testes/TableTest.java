package testes;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.TablePage;
//import pages.Tablpage;

public class TableTest extends BaseClass
{
	TablePage tablepage;
@Test
public void verify_tigernixson_office()
{
	tablepage=new TablePage(driver);
	tablepage.click_on_table();	
}
@Test
public void verify_table_heading()
{
	tablepage=new TablePage(driver);
	tablepage.click_on_table();	
	String actualtext=tablepage.gettableHeading();
	String exptext="Table with Pagination Example";
	Assert.assertEquals(actualtext, exptext);
	 String printattribute=tablepage.check_attribute();
	 System.out.println(printattribute);
}
@Test
public void verifyPersonOffice()
{
	tablepage=new TablePage(driver);
	tablepage.click_on_table();	
	String printoffice=tablepage.get_officeOf_person("Cedric Kelly");
	System.out.println(printoffice);
}
}


