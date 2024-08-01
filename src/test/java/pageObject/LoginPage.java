package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	   WebDriver ldriver;
	    
	    public LoginPage(WebDriver rDriver) {
	        ldriver = rDriver;
	        PageFactory.initElements(rDriver, this);
	    }
	    
	    @FindBy(id = "Email")
	    WebElement email;
	    
	    @FindBy(id = "Password") // Ensure the correct ID for password
	    WebElement pwd;
	    
	    @FindBy(xpath = "//button[@type='submit']")
	    WebElement lgbtn;
	    
	    @FindBy(linkText = "Logout")
	    WebElement logoutbtn;
	    
	    public void enterEmail(String emailadd)
	    {    email.clear();
	        email.sendKeys(emailadd);
	    }
	    
	    public void enterPassword(String password) {
	    	pwd.clear();
	        pwd.sendKeys(password); 
	    }
	    
	    public void clickOnLoginButton() {
	        lgbtn.click();
	    }
	    
	    public void clickOnLogoutButton() {
	        logoutbtn.click();
	    }
	}
