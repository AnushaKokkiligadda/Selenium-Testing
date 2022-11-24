package multipleclasses;

import org.testng.annotations.Test;

public class class3 extends class2 {
  @Test(priority=6)
  public void sub() {
	  System.out.println("submitted");
  }
  @Test(priority=7)
  public void log() {
	  System.out.println("loggout");
  }
}
