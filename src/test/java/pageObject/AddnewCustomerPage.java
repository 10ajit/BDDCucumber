package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddnewCustomerPage {


	   WebDriver ldriver;
	    //cunstructor 
	    public AddnewCustomerPage(WebDriver rDriver) {
	        ldriver = rDriver;
	        PageFactory.initElements(rDriver, this);
	    }
	    //Find webElement on page
	    @FindBy(xpath  = "//a[@href='#']//p[contains(text(),'Customers')]")
	    WebElement customerMenu;
	    
	    @FindBy(xpath = "(//a[@class='nav-link']//p[contains(text(),'Customers')])[1]")
	    WebElement customerBtn;
	    
	    @FindBy(xpath = "//a[@class='btn btn-primary']")
	    WebElement addNewbtn;
	    
	    @FindBy(xpath  = "//input[@id='Email']")
	    WebElement email;
	    
	    @FindBy(xpath  = "//input[@id='FirstName']")
	    WebElement firstName;
	    
	    @FindBy(xpath = "//input[@id='LastName']")
	    WebElement lastName;
	    
	    @FindBy(xpath  = "//input[@id='Password']")
	    WebElement password;
	    
	    @FindBy(xpath  = "//input[@type='radio' and @id='Gender_Male']")
	    WebElement malegender;
	    
	    @FindBy(xpath = "//input[@type='radio' and @id='Gender_Male']")
	    WebElement femalegender;
	    
	    @FindBy(xpath  = "//select[@id='VendorId']")
	    WebElement venderobj;
	    
	    @FindBy(xpath  = "(//button[@type='submit'])[2]")
	    WebElement savebtn;
	    
	    //Action Method for webElement
	    
	    public String getpageTitle() {
	    	
	    	return ldriver.getTitle();
	    	
	    }
	    
	    public void clickonCustomerMenu(){
	    	
	    	customerMenu.click();
	    	
	    	
	    }
	    
	    public void clickonCustomerMenuitem() throws InterruptedException {
	    	Thread.sleep(2000);
	    	customerBtn.click();
	    	
	    	
	    }
	    
	    public void clickonAddNewBtn() {
	    	addNewbtn.click();
	    	
	    	
	    }
	    
	    public void enterEmail(String emailid) {
	    	
	    	email.sendKeys(emailid);
	    	
	    }
public void enterPassword(String pwd) {
	    	
	password.sendKeys(pwd);
	
	    	
	    }
	    
public void enterFirstName(String fName) {
	
	password.sendKeys(fName);
	
	    	
	    }
	    
public void enterLastName(String lName) {
	
	lastName.sendKeys(lName);
	    	
	    }
public void selectGender(String gender) {
	
	if(gender.equalsIgnoreCase("Male")) {
		malegender.click();
	    	
	    }
else if(gender.equalsIgnoreCase("Female")) {
	femalegender.click();

	
}
else {
	malegender.click();
}
	    
	
}
//   public void enterManagerOfVendor(String value) {
//	   Select  selobj=new Select(venderobj);
//	   selobj.selectByValue(value);   
//	   
//   }
   
   public void enterAdminContent(String content) {
		
		lastName.sendKeys(content);
		    	
		    }
   
   public void clickonSaveBtn() {
	   savebtn.click();
   	
   	
   }
   

}