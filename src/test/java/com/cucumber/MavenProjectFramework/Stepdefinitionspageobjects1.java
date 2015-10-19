package com.cucumber.MavenProjectFramework; 

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinitionspageobjects1  {
	Gmaillogin1 gmaillogin;
	Worldremit1 worldremit;
	WorldremitLoginpage1 worldremitloginpage;
	Facebook1 facebook;
	WebDriver driver;
	
	/*public Stepdefinitionspageobjects(WebDriver driver){
		super(driver);
	}*/
	
	@Given("^initiating firefox driver$")
	public void initiating_firefox_driver() throws Throwable {
	driver = new FirefoxDriver();

	
}

	@When("^i log into gmail account \"([^\"]*)\" as \"([^\"]*)\" and \"([^\"]*)\" as \"([^\"]*)\"$")
	public void i_log_into_gmail_account_as_and_as(String link1, String username, String link2, String password) throws Throwable {
		gmaillogin = new Gmaillogin1(driver);	
		gmaillogin.loginpage();
		driver.findElement(By.id(link1)).sendKeys(username);
		driver.findElement(By.cssSelector("#next")).click();
	    driver.findElement(By.id(link2)).sendKeys(password);
	}

	@When("^i click on \"([^\"]*)\" button$")
	public void i_click_on_button(String signin) throws Throwable {
			driver.findElement(By.id(signin)).click();
	}

	@Then("^i check webpage title$")
	public void i_check_webpage_title() throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("Inbox"));
	   	}

	@Then("^i navigate to worldremit site$")
	public void i_navigate_to_worldremit_site() throws Throwable {
	
		worldremit = new Worldremit1(driver);
		worldremit.worldremitregister();
		Assert.assertTrue(driver.getTitle().contains("Money Transfer"));
		driver.findElement(By.xpath("//a[contains(@href,'/send/SignUp.aspx')]")).click();
	}

	@Then("^i passed my details$")
	public void i_passed_my_details(List<String> table) throws Throwable {
	    
		List<String> data = table;
		driver.findElement(By.id("ContentPlaceHolder1_ContentPlaceHolder1_ctCustomerSenderEdit1_lblRemitente")).sendKeys(data.get(1));
		driver.findElement(By.id("ContentPlaceHolder1_ContentPlaceHolder1_ctCustomerSenderEdit1_lblRemitenteApellido")).sendKeys(data.get(2));
		driver.findElement(By.id("ContentPlaceHolder1_ContentPlaceHolder1_ctCustomerSenderEdit1_lblEmailUser")).sendKeys(data.get(3));
		driver.findElement(By.id("ContentPlaceHolder1_ContentPlaceHolder1_ctCustomerSenderEdit1_txtClave")).sendKeys(data.get(4));
		driver.findElement(By.id("ContentPlaceHolder1_ContentPlaceHolder1_ctCustomerSenderEdit1_txtClave2")).sendKeys(data.get(5));
	
		worldremit.clickontitlebutton();
		worldremit.clickOnSubmitButton();
	}

	@Then("^i login to my worldremit Account$")
	public void i_login_to_my_worldremit_Account(DataTable table) throws Throwable {
		worldremitloginpage = new WorldremitLoginpage1(driver);
		worldremitloginpage.goToWorldRemit();
		worldremitloginpage.remitLoginPage();
		List<List<String>> data = table.raw();
		driver.findElement(By.id("ContentPlaceHolder1_ContentPlaceHolder1_txtUsuario")).sendKeys(data.get(1).get(0 ));
		driver.findElement(By.id("ContentPlaceHolder1_ContentPlaceHolder1_txtPassword")).sendKeys(data.get(1).get(1));
	}

	@Then("^i click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
	   driver.findElement(By.id("ContentPlaceHolder1_ContentPlaceHolder1_btnIngresar")).click();
	}

	@Then("^i check title of the page$")
	public void i_check_title_of_the_page() throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("Money Transfer"));
	}

	@Then("^i navigate facebook site$")
	public void i_navigate_facebook_site() throws Throwable {
		facebook = new Facebook1(driver);
		facebook.facebookLogin();
	    Assert.assertTrue(driver.getTitle().contains("Welcome to Facebook"));
	}
	@Then("^i pass my details$")
	public void i_pass_my_details(DataTable table) throws Throwable {
	  
		List<List<String>> data = table.raw();
		driver.findElement(By.id(data.get(1).get(0))).sendKeys(data.get(1).get(1));
		driver.findElement(By.id(data.get(2).get(0))).sendKeys(data.get(2).get(1));
		driver.findElement(By.id(data.get(3).get(0))).sendKeys(data.get(3).get(1));
		driver.findElement(By.id(data.get(4).get(0))).sendKeys(data.get(4).get(1));
		driver.findElement(By.id(data.get(5).get(0))).sendKeys(data.get(5).get(1));
		
		Select dropdownlist = new Select(driver.findElement(By.id("day")));
		dropdownlist.selectByVisibleText("15");;
		Select dropdownlist1 = new Select(driver.findElement(By.id("month")));
		dropdownlist1.selectByValue("6");
		Select dropdownlist2 = new Select(driver.findElement(By.id("year")));
		dropdownlist2.selectByVisibleText("1989");
		
		facebook.selectingGender();
	}

	@Then("^i click on signup button$")
	public void i_click_on_signup_button() throws Throwable {
		driver.findElement(By.id("u_0_i")).click();;

	}
	
	
	
	
}
