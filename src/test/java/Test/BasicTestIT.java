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
	  driver.get("http://54.226.235.226:8082/");
	  Assert.assertEquals("Retail Application Demo", driver.getTitle());
	  driver.close();
  }
}
