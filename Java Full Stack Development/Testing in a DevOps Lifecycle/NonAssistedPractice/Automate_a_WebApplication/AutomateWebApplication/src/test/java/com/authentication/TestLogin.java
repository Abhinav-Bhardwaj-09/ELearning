package com.authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @Created by Abhinav Bhardwaj
 * on 30-Sep-2022 at 10:37:09 AM
 * on @EclipseEE
 */


public class TestLogin {
	
	public static void main (String args []) {
		
		String driverPath = "/Users/abhinavbhardwaj/Downloads/chromedriver";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		driver.manage().window().fullscreen();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.close();
		
	}
}
