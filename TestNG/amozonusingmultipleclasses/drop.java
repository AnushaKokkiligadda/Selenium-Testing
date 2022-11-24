package amozonusingmultipleclasses;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class drop extends gettitleandurl {
  @Test(priority=5)
  public void pic() throws IOException {
	  File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src,new File("D://d.png"));
  }
  @AfterTest
  public void close() {
	  d.close();
  }
}
