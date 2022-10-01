package com.authentication;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


/**
 * @Created by Abhinav Bhardwaj
 * on 30-Sep-2022 at 01:07:48 PM
 * on @EclipseEE
 */


public class RegistrationTest {
	String driverPath = "/Users/abhinavbhardwaj/Downloads/chromedriver";
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
		System.out.println("Driver initialized...");
		
		driver.get("https://mytestingthoughts.com/Sample/home.html");
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void testLogin() {
		driver.findElement(By.name("first_name")).sendKeys("F");
		driver.findElement(By.name("last_name")).sendKeys("L");

		driver.findElement(By.id("inlineRadioMale")).click();
		
		driver.findElement(By.id("exampleFormControlSelect2")).sendKeys("Reading");
		
		driver.findElement(By.name("department")).sendKeys("Department of Engineering");
		
		driver.findElement(By.name("user_name")).sendKeys("f");
		
		driver.findElement(By.name("user_password")).sendKeys("P");
		driver.findElement(By.name("confirm_password")).sendKeys("Pa");
		
		driver.findElement(By.name("email")).sendKeys("f");
		
		driver.findElement(By.name("contact_no")).sendKeys("1");
		
		driver.findElement(By.id("exampleFormControlTextarea1"))
		.sendKeys("Name:- F L, Password:- P:Pa , "
				+ "Email:- f, Contact No:- 1");
		
		
		
		try {
			System.out.println("Thread going to sleep for 5 sec...");
			Thread.sleep(5000);
			System.out.println("Thread resumed...");
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
		
		
		driver.findElement(By.name("first_name")).clear();
		driver.findElement(By.name("last_name")).clear();
		driver.findElement(By.name("user_name")).clear();
		driver.findElement(By.name("user_password")).clear();
		driver.findElement(By.name("confirm_password")).clear();
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("contact_no")).clear();
		driver.findElement(By.id("exampleFormControlTextarea1")).clear();
		
		
		
		try {
			System.out.println("Thread going to sleep for 5 sec...");
			Thread.sleep(5000);
			System.out.println("Thread resumed...");
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
		
		
		
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
	


	@AfterTest
  	public void afterTest() {
		driver.close();
		System.out.println("Test completed...");
  	}
}
