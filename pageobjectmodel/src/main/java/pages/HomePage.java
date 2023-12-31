package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{

	WebDriver driver;
	By logo = By.xpath("(//img[@src='images/logo.png'])[1]");

	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void islogo_displayed()
	{
		WebElement logoelement = driver.findElement(logo);
		String title=driver.getTitle();
		System.out.println(title);
		String path=System.getProperty("user.dir");
		System.out.println(path);
	}
}
