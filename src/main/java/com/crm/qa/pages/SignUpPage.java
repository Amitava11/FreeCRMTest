package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase{
	
	//Page Factory - OR:
			@FindBy(name="email")
			WebElement email;
			
			@FindBy(name="phone")
			WebElement phone;
			
			@FindBy(xpath="//input[@type='checkbox']")
			WebElement agreebox;
			
			@FindBy(xpath="//button[@type='submit']")
			WebElement signUp;
			
			//Initializing the Page Objects:
			public SignUpPage(){
				PageFactory.initElements(driver, this);
			}
			
			//Actions:
			
			public void entryemail(String em){
				email.sendKeys(em);
					
			}
			public void entryphone(String ph){
				phone.sendKeys(ph);
					
			}
			public void clickcheckbox(){
				agreebox.click();
					
			}
			public void clicksignup(){
				signUp.click();
					
			}

}
