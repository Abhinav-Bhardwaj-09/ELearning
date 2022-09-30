package com.authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @Created by Abhinav Bhardwaj
 * on 30-Sep-2022 at 11:02:24 AM
 * on @EclipseEE
 */


public class TestRegistration {
	
	public static void main (String args []) {
		String driverPath = "/Users/abhinavbhardwaj/Downloads/chromedriver";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mytestingthoughts.com/Sample/home.html");					
		driver.manage().window().fullscreen();
        
        driver.findElement(By.name("first_name")).sendKeys("FirstName");
		driver.findElement(By.name("last_name")).sendKeys("LastName");

		driver.findElement(By.id("inlineRadioMale")).click();
		
		driver.findElement(By.id("exampleFormControlSelect2")).sendKeys("Reading");
		
		driver.findElement(By.name("department")).sendKeys("Department of Engineering");
		
		driver.findElement(By.name("user_name")).sendKeys("firstUser");
		
		driver.findElement(By.name("user_password")).sendKeys("Password@123");
		driver.findElement(By.name("confirm_password")).sendKeys("Password@123");
		
		driver.findElement(By.name("email")).sendKeys("firstuser@email.com");
		
		driver.findElement(By.name("contact_no")).sendKeys("111111111111");
		
		driver.findElement(By.id("exampleFormControlTextarea1"))
		.sendKeys("Name:- FirstName LastName, Password:- Password@123, "
				+ "Email:- firstuser@email.com, Contact No:- 111111111111");
		
		driver.findElement(By.className("btn")).click();
		
	}
}
