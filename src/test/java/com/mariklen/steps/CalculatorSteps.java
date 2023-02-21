package com.mariklen.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps extends BaseClass {

	@Given("The user opens the browser and opens the calculator")
	public void the_user_opens_the_browser_and_opens_the_calculator() {
		setUp();
	}

	@When("The user clicks on button {string}")
	public void the_user_clicks_on_button(String buttonId) throws InterruptedException {
		driver.findElement(By.id(buttonId)).click();
		Thread.sleep(1000);
	}

	@Then("Validate that {string} is displayed")
	public void validate_that_is_displayed(String expectedResult) {
		String actualResult = driver.findElement(By.xpath("//div[@id='display']/div")).getText();
		Assert.assertEquals("The result is NOT correct!", expectedResult, actualResult);
	}
	
	@Then("Close the browser")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(1000);
		tearDown();
	}

}
