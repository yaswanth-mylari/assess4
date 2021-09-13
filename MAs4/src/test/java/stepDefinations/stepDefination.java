package stepDefinations;

import cucumber.api.java.en.Given;



import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageLocaters.benifits;
import pageLocaters.dest;
import pageLocaters.ourbrands;
import resources.base;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

//@RunWith(Cucumber.class)
public class stepDefination extends base{
	public static Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	//public ourbrands ob;
    
	@Given("^inititalise the \"([^\"]*)\" browser$")
    public void inititalise_the_something_browser(String strArg1) throws Throwable {
		driver=initializeDriver(strArg1);
		log.info("initialised browser");
    }

    @When("^user is on \"([^\"]*)\" site$")
    public void user_is_on_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
    	log.info("url countered");
    }

    @Then("^validate if \"([^\"]*)\" is present$")
    public void validate_if_something_is_present(String strArg1) throws Throwable {
    	ourbrands ob=new ourbrands(driver);
    	//System.out.println(ob.jwmarriot().getText());
    	Assert.assertEquals(ob.jwmarriot().getText(), strArg1);
    	log.info("Validated JW marriot");
    }

    @And("^clicks on our brands$")
    public void clicks_on_our_brands() throws Throwable {
    	ourbrands ob=new ourbrands(driver);
        ob.brand().click();
        
    }
    
   
    @Then("^hotels should be displayed$")
    public void hotels_should_be_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	dest d=new dest(driver);
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement ele=d.findhotels();
		jse.executeScript("arguments[0].click()", ele); 
		log.info("hotels displayed");
    }
    @And("^enters the (.+) city$")
    public void enters_the_city(String destination) throws Throwable {
        dest d=new dest(driver);
        WebElement select=d.destination();
        select.sendKeys(destination);
		select.sendKeys(Keys.ENTER);
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement ele=d.findhotels();
		jse.executeScript("arguments[0].click()", ele);*/
		log.info("destination entered");
		
    }

    @And("^verify if \"([^\"]*)\" is present$")
    public void verify_if_something_is_present(String strArg1) throws Throwable {
    	dest d=new dest(driver);
    	Assert.assertEquals(strArg1,d.city().getAttribute("data-city"));
    	log.info("destination verifieed");
    }
    @Then("^validate the \"([^\"]*)\" is present$")
    public void validate_the_something_is_present(String strArg1) throws Throwable {
        //throw new PendingException();
    	 benifits b=new benifits(driver);
    	 System.out.println( b.keys().get(2).getText());
    }

    @And("^clicks member benifits$")
    public void clicks_member_benifits() throws Throwable {
        //throw new PendingException();
    	benifits b=new benifits(driver);
   	 	b.mb().click();
   	 log.info("member benifits clicked");
    }
}