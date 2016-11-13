package testcases;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import base.AppBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreditCardFormPage;
import pages.HomePage;
public class steps extends AppBase{	
	AppBase cucumber=AppBase.getInstance();	
	@Given("^I open firefox browser$")
	public void I_open_firefox_browser() {
	    System.out.println("I open firefox browser");
	    cucumber.OpenBrowser("Mozilla");	    
	}

	@When("^I navigate url application$")
	public void I_navigate(){
	   System.out.println("I navigate application url");
	   cucumber.navigate("http://hdfcbank.com");
	}

	@Then("^I clicked on credit card icon$")
	public CreditCardFormPage I_click_on_ccicon(){
	    System.out.println("I clicked on credit card icon");
	    HomePage hp=PageFactory.initElements(driver, HomePage.class);
	    return hp.clickccbtn();
	}
	
	@Then("^I select popup window$")
	public void I_select_popup_window() throws Throwable {
	    System.out.println("I select popup window");
	    cucumber.selectwindow();
	}
	
	@Given("^Fill credit card application from \"([^\"]*)\",\"([^\"]*)\"$")
	public void Fill_Cc(String naperu, String naalastname) throws Throwable {
	    System.out.println("Fill credit card application from");
	    CreditCardFormPage ccf=PageFactory.initElements(driver, CreditCardFormPage.class);
	    ccf.fillccform(naperu, naalastname);
	}
	
	@Then("^close the application$")
	public void close_browser() throws Throwable {
	    System.out.println("close the application");
	    cucumber.closeBrowser();
	}

}
