package com.jenkins.selenium;

import java.io.File;

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
	  
	  File file = new File("src/main/resources/geckodriver.exe");
	  System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
	  driver = new FirefoxDriver();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}