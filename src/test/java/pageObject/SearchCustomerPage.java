package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPage {


	   WebDriver ldriver;
	    
	    public SearchCustomerPage(WebDriver rDriver) {
	        ldriver = rDriver;
	        PageFactory.initElements(rDriver, this);
	    }
	    
	    @FindBy(id = "SearchEmail")
	    WebElement Searchemail;
	    
	    @FindBy(id = "search-customers") // Ensure the correct ID for password
	    WebElement searchbtn;
	    
	    @FindBy(xpath = "//button[@type='submit']")
	    WebElement lgbtn;
	
	//==================================================
	    public void enterEmailAddress(String emailAdd) {
	    	Searchemail.sendKeys(emailAdd);
	    }
	
}
