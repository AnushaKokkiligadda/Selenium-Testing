package practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practice {
	WebDriver d;
  @Test(priority=1)
  public void open_browser() {
	  System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://demo.guru99.com/test/newtours/");
	  d.manage().window().maximize();
  }
  @Test(priority=2)
  public void title() {
	  System.out.println(d.getTitle());
  }
  @Test(priority=3)
  public void url() {
	  System.out.println(d.getCurrentUrl());
  }
  @Test(priority=4)
  public void check() throws InterruptedException, IOException {
	  FileInputStream f1=new FileInputStream("D:\\excel1.xlsx");
	  XSSFWorkbook wb=new XSSFWorkbook(f1);
	  XSSFSheet ws=wb.getSheet("Sheet1");
	  Row r=null;
	  Cell c=null;
	  String exp="https://demo.guru99.com/test/newtours/";
	  WebElement a=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
	  List<WebElement> b=a.findElements(By.tagName("a"));
	  System.out.println(b.size());
	  for(int i=0;i<b.size();i++) {
		  System.out.println(b.get(i).getText());
		  r=ws.createRow(i);
		  r.createCell(0).setCellValue(b.get(i).getText());
		  b.get(i).click();
		  String act=d.getCurrentUrl();
		  System.out.println(act);
		  r.createCell(1).setCellValue(exp);
		  r.createCell(2).setCellValue(act);
		  if(exp.equalsIgnoreCase(act)) {
			  //System.out.println("equal");
			  r.createCell(3).setCellValue("True");
		  }
		  else {
			  r.createCell(3).setCellValue("False");
		  }
		  Thread.sleep(2000);
		  d.navigate().back();
		  Thread.sleep(2000);
		  a=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		  b=a.findElements(By.tagName("a"));
	  }	  
	  FileOutputStream f2=new FileOutputStream("D:\\excel1.xlsx");
	  wb.write(f2);
	  f2.close();
  }
  
}

