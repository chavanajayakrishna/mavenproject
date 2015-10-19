package com.cucumber.MavenProjectFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleFacebook {
	WebDriver driver;
	@Given("^navigate to facebook webpage$")
	public void navigate_to_facebook_webpage() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("http://www.facebook.com/");
	}

	@When("^enter user details$")
	public void enter_user_details() throws Throwable {
	   driver.findElement(By.id("email")).sendKeys("+447478706381");
	   driver.findElement(By.id("pass")).sendKeys("jagadeesh492");
	}
	@Then("^clicking on submit button$")
	public void clicking_on_submit_button() throws Throwable {
	    driver.findElement(By.id("u_0_l")).click();
	}

}
