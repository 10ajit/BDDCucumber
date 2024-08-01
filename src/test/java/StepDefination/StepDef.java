package StepDefination;
import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.AddnewCustomerPage;
import pageObject.LoginPage;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.Assert;

public class StepDef {
	  public WebDriver driver;
	    public LoginPage loginpg;
	    public AddnewCustomerPage newctmrPage;

	    @Given("User launches Chrome browser")
	    public void user_launches_chrome_browser() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        loginpg = new LoginPage(driver);
	        
	        newctmrPage=new AddnewCustomerPage(driver);
	    }

	    @When("User opens the url {string}")
	    public void user_opens_the_url(String url) {
	        driver.get(url);
	    }

	    @When("User enters Email as {string} and Password as {string}")
	    public void user_enters_email_as_and_password_as(String email, String password) {
	        loginpg.enterEmail(email);
	        loginpg.enterPassword(password);
	    }

	    @When("User clicks on the login button")
	    public void user_clicks_on_the_login_button() {
	        loginpg.clickOnLoginButton();
	    }

	    @Then("Page Title should be {string}")
	    public void page_title_should_be(String expectedTitle) {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.titleIs(expectedTitle));
	    	
	    	String actualTitle = driver.getTitle();
	    	
	       if(actualTitle.equalsIgnoreCase(expectedTitle)) {
	    	   Assert.assertTrue(true);
	    	   
	       }
	       else {
	    	   Assert.assertTrue(false);
	       }
	       
	    }

	    @When("User clicks on the Logout link")
	    public void user_clicks_on_the_logout_link() {
	        loginpg.clickOnLogoutButton();
	    }

	    @Then("User closes the browser")
	    public void user_closes_the_browser() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	    
	    //================Add New Customer==========
	    @Then("User can view Dashboard")
	    public void user_can_view_dashboard() {
	       String actualTitle=newctmrPage.getpageTitle();
	    	String expectedTitle="Dashboard / nopCommerce administration";
	    	
	    	if(actualTitle.equalsIgnoreCase(expectedTitle)) {
	    		Assert.assertTrue(true);
	    	}
	    	else {
	    		Assert.assertTrue(false);
	    	}
	    }

	    @When("User click on customer Menu")
	    public void user_click_on_customer_menu() {
	    	newctmrPage.clickonCustomerMenu();
	    }

	    @When("click on customer Menu Item")
	    public void click_on_customer_menu_item() throws InterruptedException {
	    	newctmrPage.clickonCustomerMenuitem();
	    }

	    @When("click on Add new button")
	    public void click_on_add_new_button() {
	    	newctmrPage.clickonAddNewBtn();
	    }

	    @Then("User can view add new customer page")
	    public void user_can_view_add_new_customer_page() {
	        String actualTitle=newctmrPage.getpageTitle();
	        String expectedTitle="Add a new customer / nopCommerce administration";
	        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
	    		Assert.assertTrue(true);
	    	}
	    	else {
	    		Assert.assertTrue(false);
	    	}
	    }

	    @When("User enter customer info")
	    public void user_enter_customer_info() {
	        
	    	newctmrPage.enterEmail("test2@gmail.com");
	    	newctmrPage.enterPassword("test@123");
	    	newctmrPage.enterFirstName("Ajit");
	    	newctmrPage.selectGender("male");
	    	//newctmrPage.enterManagerOfVendor("Vendor 1");
	    	newctmrPage.enterAdminContent("testing Admin content");
	    }

	    @When("click on Save button")
	    public void click_on_save_button() {
	    	newctmrPage.clickonSaveBtn();
	    }

	    @Then("User can view confirmation message\"The new customer has been added successfully.")
	    public void user_can_view_confirmation_message_the_new_customer_has_been_added_successfully(String expectedConfirmationMessage) {
	       String bodyTagText= driver.findElement(By.tagName("Body")).getText();
	    	if(bodyTagText.contains(expectedConfirmationMessage)) {
	    		Assert.assertTrue(true);
	    	}
	    	else {
	    		Assert.assertTrue(false);
	    	}
	    	
	    }
	}


