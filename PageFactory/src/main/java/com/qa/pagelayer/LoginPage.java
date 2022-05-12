package com.qa.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase_class;

public class LoginPage extends Testbase_class
{
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='user-name']")
	 private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	 private WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	 private WebElement login;
	
	public void EnterUserName()
	{
		username.sendKeys("standard_user");
	}
	public void EnterPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	public void ClickonLogin()
	{
		login.click();
	}

}
