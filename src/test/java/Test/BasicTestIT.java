package Test;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTestIT {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "/usr/bin/firefox");
	  WebDriver	driver = new ChromeDriver();
	  driver.get("http://localhost:8080/");
	  Assert.assertEquals("Retail Application Demo", driver.getTitle());
	  driver.close();
  }
}
