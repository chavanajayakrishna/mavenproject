package com.cucumber.MavenProjectFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleGmail {
	WebDriver driver;


@Given("^going to gmail webpage$")
public void going_to_gmail_webpage() throws Throwable {
	driver= new FirefoxDriver();
    driver.navigate().to("http://www.gmail.com/");
}

@When("^enters user details$")
public void enters_user_details() throws Throwable {
	driver.findElement(By.id("Email")).sendKeys("chavanajayakrishna");
	driver.findElement(By.id("Passwd")).sendKeys("Jagadeesh4"); 
}

@Then("^click on submit button$")
public void click_on_submit_button() throws Throwable {
	driver.findElement(By.id("signIn")).click();

}

}
