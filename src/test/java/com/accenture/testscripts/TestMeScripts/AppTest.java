package com.accenture.testscripts.TestMeScripts;


import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class AppTest{
	
	@Test
	public void testHome() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/TestMeApp/");
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys("Rathna");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Password11");
		driver.findElement(By.name("Login")).click();
	}
}