package amozonusingmultipleclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login1 {
	WebDriver d;
  @BeforeTest
  public void open_browser() {
	  System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.amazon.in/");
	  d.manage().window().maximize();
  }
  @Test(priority=1)
  public void title() {
	  System.out.println(d.getTitle());
  }
}
