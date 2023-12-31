package testes;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;

public class HomeTest extends BaseClass

{
	HomePage homepage;//global
@Test
public void verify_logo()
{
	homepage=new HomePage(driver);
	//String title=driver.getTitle();
	//System.out.println(title);
	homepage.islogo_displayed();
}
}
