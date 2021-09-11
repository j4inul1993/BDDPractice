package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageFact {
	public MainPageFact(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

@FindBy (xpath="(//*[contains(@class,'input')])[1]")
private WebElement username;

@FindBy (xpath="(//*[contains(@class,'input')])[2]")
private WebElement password;

@FindBy (xpath="(//*[contains(@class,'button')])[2]")
private WebElement loginbutton;

@FindBy (xpath="//*[contains(text(),'Transfer Funds')]")
private WebElement transferfunds;

@FindBy (xpath="//*[contains(@id,'amount')]")
private WebElement transferamount;

@FindBy (xpath="(//*[contains(@class,'button')])[2]")
private WebElement transfertbutton;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLoginbutton() {
	return loginbutton;
}

public WebElement getTransferfunds() {
	return transferfunds;
}

public WebElement getTransferamount() {
	return transferamount;
}

public WebElement getTransfertbutton() {
	return transfertbutton;
}


}
