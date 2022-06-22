package com.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.CommonActions;

public class MobilePurchasePage extends CommonActions{
	  
	public MobilePurchasePage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closeicon;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement SEARCH;
	
	@FindBy(xpath="(//div[contains(text(),'realme')])[4]")
	private WebElement mobilename;
	@FindBy(xpath="//button[text()='BUY NOW']")
	private WebElement add;

	public WebElement getMobilename() {
		return mobilename;
	}

	public WebElement getCloseicon() {
		return closeicon;
	}

	public WebElement getSEARCH() {
		return SEARCH;
	}

	public WebElement getAdd() {
		return add;
	}
	
}
