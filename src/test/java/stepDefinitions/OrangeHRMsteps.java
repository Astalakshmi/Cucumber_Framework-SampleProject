package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class OrangeHRMsteps {
	
	WebDriver driver;
	
	@Given("I launch chrome Browser")
	public void i_launch_chrome_browser() {
	   
		driver = new ChromeDriver();
	}

	@When("I open orange hrm homepage")
	public void i_open_orange_hrm_homepage() {
	    
		driver.get("https://www.orangehrm.com/");
	}

	@Then("I verify that the logo present on page")
	public void i_verify_that_the_logo_present_on_page() {
	   
		boolean status = driver.findElement(By.cssSelector(".navbar-brand.nav-logo")).isDisplayed();
	    Assert.assertEquals(true, status);
	}

	@And("close Browser")
	public void close_browser() {
		driver.quit();
	    
	}
	

}
