package com.flipkart.stepdefintion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.flipkart.objectrepository.MobilePurchasePage;
import com.flipkart.resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobillePurchaseSteps extends CommonActions {
	CommonActions c =new CommonActions();
	MobilePurchasePage m = new MobilePurchasePage();
	@Given("user launches flipkart application")
	public void user_launches_flipkart_application() {
		
	}

	@Given("user able to login flipkart with credentials")
	public void user_able_to_login_flipkart_with_credentials() {
		 
		 m.getCloseicon().click();
		 
	}

	@When("user search mobiles and choose")
	public void user_search_mobiles_and_choose() {
		 
		 c.insertText(m.getSEARCH(), "realme");
			
			
	   m.getMobilename().click(); 
	}

	@When("user add mobile to add to cart and doing payment")
	public void user_add_mobile_to_add_to_cart_and_doing_payment() throws InterruptedException {
		 c.windowsHandling();
		Thread.sleep(5000);
		String text2 = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
	}

	@Then("user validate the confirmation message")
	public void user_validate_the_confirmation_message() {
		
		WebElement add = driver.findElement(By.xpath("//button[text()='BUY NOW']"));
		c.scrolldown(add);
	   
	}
	  
	@When("user search mobiles and choose by one dimensional list")
	public void user_search_mobiles_and_choose_by_one_dimensional_list(DataTable dataTable) {
		 List<String> asList = dataTable.asList();
		 c.insertText(m.getSEARCH(), asList.get(0));
			
			driver.findElement(By.xpath("(//div[contains(text(),'"+asList.get(0)+"')])[4]")).click();
	   
	}

	@When("user search mobiles and choose by one dimensional map")
	public void user_search_mobiles_and_choose_by_one_dimensional_map(DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		c.insertText(m.getSEARCH(),  asMap.get("phone3"));
		
			driver.findElement(By.xpath("(//div[contains(text(),'"+asMap.get(2)+"')])[4]")).click();
	   
	}
	@When("user search mobiles and choose {string}")
	public void user_search_mobiles_and_choose(String name) {
		c.insertText(m.getSEARCH(), name);
	
		driver.findElement(By.xpath("(//div[contains(text(),'"+name+"')])[4]")).click();
	}


}
