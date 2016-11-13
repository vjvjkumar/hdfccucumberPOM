package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditCardFormPage {
	public WebDriver driver;
	
	public CreditCardFormPage(WebDriver driver){
		this.driver=driver;
	}	
	
	@FindBy(xpath="//*[@id='txtFName']")
	public WebElement fname;
	
	
	@FindBy(xpath="//*[@id='txtLName']")
	public WebElement lname;
	
	public void fillccform(String myfname, String mylname){
		fname.sendKeys(myfname);
		lname.sendKeys(mylname);
	}
	
}
