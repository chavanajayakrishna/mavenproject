package com.cucumber.MavenProjectFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Worldremit1 extends AbstractcMultiple1{

	public Worldremit1(WebDriver driver) {
		super(driver);
	}
	public Worldremit1 worldremitregister(){
		driver.get("http://www.worldremit.com/");
		return new Worldremit1(driver);
	}
	public Worldremit1 clickontitlebutton(){
		driver.findElement(By.id("ContentPlaceHolder1_ContentPlaceHolder1_ctCustomerSenderEdit1_labelMr")).click();
	return new Worldremit1(driver);
	}
	public WorldremitLoginpage1 clickOnSubmitButton(){
		driver.findElement(By.id("ContentPlaceHolder1_ContentPlaceHolder1_btnSalvar")).click();
	return new WorldremitLoginpage1(driver);
	}
}
