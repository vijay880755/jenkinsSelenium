package com.jenkins.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void openwebsite() {
	driver.get("https://www.google.com/");
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}