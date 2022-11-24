package amozonusingmultipleclasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class gettitleandurl extends login1 {
  @Test(priority=2)
  public void url() {
	  System.out.println(d.getCurrentUrl());
  }
  @Test(priority=4)
  public void ddown() {
	  WebElement a=d.findElement(By.id("searchDropdownBox"));
	  a.click();
	  List<WebElement> b=a.findElements(By.tagName("option"));
	  System.out.println(b.size());
	  for(int i=0;i<b.size();i++) {
		  System.out.println(b.get(i).getText());
	  }
  }
}
