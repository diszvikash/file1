package com.Klu.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Klu.GenericLib.BaseTest;

public class CustomViewPage 
{
	@FindBy(xpath="//input[@value='New Lead']") private WebElement newLeadsBtn;
	
	public CustomViewPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickNewLeadBtn()
	{
		newLeadsBtn.click();
	}

}
