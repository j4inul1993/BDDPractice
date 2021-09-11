package StepDef;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.support.PageFactory;

import BaseClass.Baseclass;
import CommonUtility.Utility;
import PageFactory.MainPageFact;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import junit.framework.Assert;

public class Stepdef extends Baseclass{
	MainPageFact mf;
	@Given("^Open Browser$")
	public void open_Browser()  {
	 mf=PageFactory.initElements(driver,MainPageFact.class);   
	    
	}

	@When("^Open Url$")
	public void open_Url() throws IOException{
	driver.get(prop.getProperty("url"));
	    
	}

	@When("^Input Id and Password$")
	public void input_Id_and_Password()  {
	mf.getUsername().sendKeys(prop.getProperty("ID"));
	 Utility.Highlighter(driver);
	mf.getPassword().sendKeys(prop.getProperty("pw"));
	
	}

	@When("^Click submit button$")
	public void click_submit_button() throws IOException  {
	 mf.getLoginbutton().click();
	
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 Utility.Screenshot(driver, "Homepage");
	}

	@When("^Click on the transfer button$")
	public void click_on_the_transfer_button()  {
	 mf.getTransferfunds().click();  
	    
	}

	@When("^Put the amount and submit$")
	public void put_the_amount_and_submit()  {
	mf.getTransferamount().sendKeys(prop.getProperty("Amount"));    
	mf.getTransfertbutton().click();  
	}

	@Then("^Validate the page title$")
	public void validate_the_page_title()  {
	 String response= driver.getTitle();
	 System.out.println(response);
	    
	}
}
