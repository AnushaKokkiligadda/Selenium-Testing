package multipleclasses;

import org.testng.annotations.Test;

public class class1 {
  @Test(priority=1)
  public void login() {
	  System.out.println("login seccessfully");
  }
  @Test(priority=2)
  public void cust() {
	  System.out.println("Customer details");
  }
  @Test(priority=3)
  public void prod() {
	  System.out.println("Product details");
  }
}
