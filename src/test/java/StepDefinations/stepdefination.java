package StepDefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.SeleniumUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefination {
	 WebDriver driver = SeleniumUtil.getDriver();

	 @Before
	    public void setUp(Scenario scenario) {
	        driver = SeleniumUtil.getDriver();
	    }

	    @Given("I open Google")
	    public void i_open_google(Scenario scenario) {
	        driver.get("https://www.google.com");
	        captureScreenshot(scenario);
	    }

	    @When("I search for {string}")
	    public void i_search_for(String searchTerm) {
	        driver.findElement(By.name("q")).sendKeys(searchTerm);
	        driver.findElement(By.name("q")).submit();
	    }

	    @Then("I should see search results")
	    public void i_should_see_search_results(Scenario scenario) throws IOException {	       
	    	captureScreenshot(scenario);

	    }

	    @After
	    public void tearDown() {
	    	SeleniumUtil.tearDown();
	    	}
	    private void captureScreenshot(Scenario scenario) {
	        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "screenshot");
	    }
	}