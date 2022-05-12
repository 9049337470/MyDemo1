package com.qa.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase_class 
{
	public  static WebDriver driver;
	
	@BeforeTest
	public void start()
	{
		String abc="chrome";
		if(abc.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(abc.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
           driver=new FirefoxDriver();
		}
		else if(abc.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Enter valid url of browser");
		}
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void end()
	{
		driver.quit();
	}
	
	}


