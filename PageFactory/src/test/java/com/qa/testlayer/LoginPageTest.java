package com.qa.testlayer;

import org.testng.annotations.Test;

import com.qa.pagelayer.LoginPage;
import com.qa.testbase.Testbase_class;

public class LoginPageTest extends Testbase_class 
{
	@Test
	public void VerifyFunctionalityOfLoginPage() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.EnterUserName();
		Thread.sleep(2000);
        lp.EnterPassword();
		Thread.sleep(2000);
		lp.ClickonLogin();
		Thread.sleep(2000);

		
	}

}
