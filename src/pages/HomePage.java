package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage{
	public WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[@id='element2']/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[2]/img[1]")
	public static WebElement ccicon;
	
	@FindBy(xpath="//*[@id='element2']/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/a[1]")
	public static WebElement applynow;
	
	
	@FindBy(xpath="//*[@id='cee_closeBtn']")
	public static WebElement closebtn;
	
	public CreditCardFormPage clickccbtn(){
		closebtn.click();
		ccicon.click();
		applynow.click();
		return PageFactory.initElements(driver, CreditCardFormPage.class);	
	}
	
}
