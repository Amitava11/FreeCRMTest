package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class DealsPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	DealsPage dealsPage;
	
	public DealsPageTest(){
		super();
		
}


@BeforeMethod
public void setUp() throws InterruptedException {
	
	initialization();
	testUtil = new TestUtil();
	//contactsPage = new ContactsPage();
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	testUtil.switchToFrame();
	dealsPage = homePage.clickOnDealsLink();
}

@Test(priority=1)
public void verifyDealsPageLabel(){
	Assert.assertTrue(dealsPage.verifyDealsLabel(), "deals label is missing on the page");
}

@Test(priority=2)
public void VerifySearchDealsTest(){
	dealsPage.SearchDeals();
}

@AfterMethod
public void tearDown(){
	driver.quit();
}
	
	
}
