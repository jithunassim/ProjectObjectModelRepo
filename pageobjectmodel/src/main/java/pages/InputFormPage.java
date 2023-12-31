package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPage 
{
WebDriver driver;
By inputformclick=By.xpath("//a[contains(text(),'Input Form')]");
By showbutton=By.xpath("//button[@id='button-one']");
By datepicker=By.xpath("//a[contains(text(),'Date Pickers')]");
public InputFormPage(WebDriver driver)
{
	this.driver=driver;
}
public void clickinputform()
{
	WebElement inputformelement=driver.findElement(inputformclick);
	inputformelement.click();
}
public String getshowbutton_text()
{
	WebElement showbuttonelement=driver.findElement(showbutton);
	 String buttontext=showbuttonelement.getText();
	 return(buttontext);
	 //WebElement showMsgelement=driver.findElement(showMessage);
		//return showMsgelement.getText();
}
public void clickon_datepicker()
{
	WebElement datepickerelement=driver.findElement(datepicker);
	datepickerelement.click();
	
}
}
