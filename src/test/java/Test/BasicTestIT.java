package Test;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTestIT {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "/bin/chromedriver");
	  WebDriver	driver = new ChromeDriver();
	  driver.get("http://retailapp.cogpcfdevops.com/");
	  Assert.assertEquals("Retail Application Demo", driver.getTitle());
	  driver.close();
  }
}
