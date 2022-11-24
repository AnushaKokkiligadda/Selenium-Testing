package TeastNGpackage;

import org.testng.annotations.Test;

public class test1 {
  @Test(priority=1)
  public void open_browser() {
	  System.out.println("Applicstion opened");
  }
  @Test(priority=2)
  public void cust_details() {
	  System.out.println("Customer details");
  }
  @Test(priority=3)
  public void prod_details() {
	  System.out.println("Product");
  }
  @Test(priority=4)
  public void payment() {
	  System.out.println("Pay");
  }
  @Test
  public void delivery() {
	  System.out.println("delivered");
  }
  @Test(enabled=false)
  public void close() {
	  System.out.println("closed");
  }
}
