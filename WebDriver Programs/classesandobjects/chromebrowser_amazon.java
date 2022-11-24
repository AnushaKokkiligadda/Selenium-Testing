
package classesandobjects;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser_amazon {
	WebDriver d;
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
	}
	public void GetTitle() {
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
	}
	public void count() {
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement> b=a.findElements(By.tagName("option"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++) {
			System.out.println(b.get(i).getText());
		}
	}
	public void screen() throws IOException {
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D://amazon.png"));
	}
	public void shut() {
		d.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		chromebrowser_amazon y=new chromebrowser_amazon();
		y.OpenBrowser();
		y.GetTitle();
		y.count();
		y.screen();
		y.shut();		
		

	}

}
