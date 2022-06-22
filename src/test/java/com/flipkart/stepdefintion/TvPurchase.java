package com.flipkart.stepdefintion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.flipkart.objectrepository.MobilePurchasePage;
import com.flipkart.objectrepository.TvPurchasepage;
import com.flipkart.resources.CommonActions;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class TvPurchase extends CommonActions {
	CommonActions c =new CommonActions();
	TvPurchasepage t = new TvPurchasepage();
	@When("user search tv and choose")
	public void user_search_tv_and_choose() {
		
		 c.insertText(t.getSEARCH(), "SAMSUNG tv ");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	t.getTvname().click();
	
	}

	@When("user add tv to add to cart and doing payment")
	public void user_add_tv_to_add_to_cart_and_doing_payment() throws InterruptedException {
		 c.windowsHandling();
		Thread.sleep(5000);
		String text2 =driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
	}
	@When("user search tv and choose by one dimensional list")
	public void user_search_tv_and_choose_by_one_dimensional_list(DataTable dataTable) {
		 List<String> asList = dataTable.asList();
		 c.insertText(t.getSEARCH(), asList.get(0));
		
		 MobillePurchaseSteps.driver.findElement(By.xpath("(//div[contains(text(),'"+asList.get(0)+"')])[4]")).click();
	   
	    
	}
	@When("user search tv and choose by one dimensional map")
	public void user_search_tv_and_choose_by_one_dimensional_map(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		c.insertText(t.getSEARCH(),  asMap.get("phone3"));
		
		MobillePurchaseSteps.driver.findElement(By.xpath("(//div[contains(text(),'"+asMap.get(2)+"')])[4]")).click();
	}
	@When("user search tv and choose {string}")
	public void user_search_tv_and_choose(String name) {
		c.insertText(t.getSEARCH(), name);
		MobillePurchaseSteps.driver.findElement(By.xpath("(//div[contains(text(),'"+name+"')])[4]")).click();
	}
}
