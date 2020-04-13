package stepdefinations;

import org.openqa.selenium.chrome.ChromeDriver;

//import com.cucumber.listener.Reporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import selenium_pages.main_code;

public class stepdef_googlehomepage  {
	
	main_code m=new main_code();
	@Given("I launch Chrome browser")
	public void open_browser() throws Exception {
		m.launchBrowser();
		// Reporter.addStepLog("browser launched");
		 
		
		
	}
	@When("I open onlinegrocery  Homepage")
public void open_google()throws Exception {
		m.openGoogleURL();
		// Reporter.addStepLog("entered url");
		
	}
	@Then("I verify that the page displays search text box")
	public void i_verify_that_the_page_displays_search_text_box() {
	    m.checkSearchBoxIsDisplayed();
	    
	}
	
	
//	@Then("the page displays Search button")
//	public void the_page_displays_Google_Search_button() {
//		m.checkGoogleSearchButtonIsDisplayed();
//	   
//	}

	
//	@Then("the page displays Im Feeling Lucky button")
//	public void the_page_displays_Im_Feeling_Lucky_button() {
//	   m.checkImFeelingLuckyButtonIsDisplayed();
//	    
//	}
	
	@When("I enter search keyword")
	public void i_enter_search_keyword() {
		
	    m.enterkeyword();
	   
	}

	@Then("I verify search results are loaded")
	public void i_verify_search_results_are_loaded() {
	    m.searchkeyword();
	    
	}
	
	@When("I click on add to cart button")
	public void I_click_on_add_to_cart_button() {
		
	    m.add_tocart();
	   
	}

	@Then("I verify that Product added to cart")
	public void I_verify_that_Product_added_to_cart() {
	    m.check_tocart();
	    
	}



}
