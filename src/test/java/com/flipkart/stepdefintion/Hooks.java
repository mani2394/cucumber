package com.flipkart.stepdefintion;

import com.flipkart.resources.CommonActions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonActions {
	CommonActions c =new CommonActions();
	@Before
	public void beforeLaunch() {
		System.out.println("before each and every scenario");
		c.launch();
	}
	@After
	public void afterLaunch() {
		System.out.println("after each and every scenario");
		driver.quit();
	}

}
