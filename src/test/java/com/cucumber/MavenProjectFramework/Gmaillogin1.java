package com.cucumber.MavenProjectFramework;

import org.openqa.selenium.WebDriver;

public class Gmaillogin1 extends AbstractcMultiple1{

  //  WebDriver driver;	
	
	public Gmaillogin1(WebDriver driver) {
		super(driver);
		//this.driver=driver;
	}

	public Worldremit1 loginpage(){
		driver.get("http://www.gmail.com/");
		return new Worldremit1(driver);
	}
}
