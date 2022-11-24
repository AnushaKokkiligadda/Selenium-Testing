package multipleclasses;

import org.testng.annotations.Test;

public class class2 extends class1 {
  @Test(priority=4)
  public void del() {
	  System.out.println("deliverred successfully");
  }
  @Test(priority=5)
  public void feed() {
	  System.out.println("Feedback");
  }
}
