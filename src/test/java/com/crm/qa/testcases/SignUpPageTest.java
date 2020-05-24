package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase{

	SignUpPage signupPage;
	LoginPage loginpage;
	
	public SignUpPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();	
		loginpage  =new LoginPage();
		signupPage=loginpage.SignUpClick();
	}
	
	@Test(priority=1)
	public void entryemailTest(){
		signupPage.entryemail(prop.getProperty("emailaddress"));
	}
	
	@Test(priority=2)
	public void entryephoneTest(){
		signupPage.entryphone(prop.getProperty("phone"));
	}
	
	@Test(priority=3)
	public void clickcheckboxTest(){
		
		signupPage.clickcheckbox();
	}
	
	@Test(priority=4)
	public void clicksignupTest() {
		
		signupPage.clicksignup();
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
