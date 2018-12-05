package log4jPackage;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
//private final static Logger logger = Logger.getLogger(NewTest.class);
   Logger log = Logger.getLogger("NewTest.class");
   WebDriver driver = new ChromeDriver();
  
@Test(priority=1)
  public void f() { 
	driver.get("https://www.naukri.com/");
  driver.manage().window().maximize();
  driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
  log.info("naukri portal is found");
  
  System.out.println("test...");
  
  }
  
  @Test(priority=2)
  public void a() {
	  driver.findElement(By.xpath("//*[@id=\"eLoginNew\"]")).sendKeys("rajani.1993pal@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"eLoginNew\"]")).sendKeys(Keys.ENTER);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//*[@id=\"pLogin\"]")).sendKeys("Rajanipal@1905");
	    driver.findElement(By.xpath("//*[@id=\"pLogin\"]")).sendKeys(Keys.ENTER);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    log.info("login completed");
  
  }
  
  
  @AfterMethod
  public void afterMethod() {
  }

  @AfterClass
  public void afterClass() {
  }

}
