package com.cucumber.MavenProjectFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook1 extends AbstractcMultiple1{

	public Facebook1(WebDriver driver) {
	super(driver);
	}
	public Facebook1 facebookLogin(){
		driver.get("https://www.facebook.com/");
		return new Facebook1(driver);
	}
	public Facebook1 selectingGender(){
		
		   driver.findElement(By.id("u_0_e")).click();
		   return new Facebook1(driver);
	}
}
