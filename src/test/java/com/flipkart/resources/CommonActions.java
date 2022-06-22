package com.flipkart.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	
	public static WebDriver driver;
	public void launch() {
		WebDriverManager.edgedriver().setup();  
		
		 driver= new EdgeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public void insertText(WebElement ele, String value) {
		ele.sendKeys(value,Keys.ENTER);
	}

public void windowsHandling() {
	Set<String> child = driver.getWindowHandles();
	List<String> l= new ArrayList<String>(child);
	driver.switchTo().window(l.get(1));
		
	}
public void scrolldown(WebElement element) {
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("argument[0].scrollIntoView(true)", element );
}

public void scrolldown() {
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("windows.scrollBy(0,100)"  );
}
}
