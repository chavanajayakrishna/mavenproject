package com.cucumber.MavenProjectFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorldremitLoginpage1 extends AbstractcMultiple1{

	public WorldremitLoginpage1(WebDriver driver){
		super(driver);
		}
	public WorldremitLoginpage1 goToWorldRemit(){
		driver.navigate().to("http://www.worldremit.com/");
		return new WorldremitLoginpage1(driver);
	}
	public  Facebook1 remitLoginPage(){
		driver.findElement(By.xpath("//a[contains(@href,'/send/LoginPage.aspx')]")).click();
		return new Facebook1(driver);
	}
	
}
