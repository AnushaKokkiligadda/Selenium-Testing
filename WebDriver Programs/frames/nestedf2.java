package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedf2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.dezlearn.com/nested-iframes-example/");
		d.manage().window().maximize();
		d.switchTo().frame("parent_iframe");
		d.findElement(By.id("u_5_5")).click();
		String s=d.findElement(By.id("processing")).getText();
		System.out.println(s);
		d.switchTo().frame("iframe1");
		d.findElement(By.id("u_5_6")).click();
		String s1=d.findElement(By.id("processing")).getText();
		System.out.println(s1);
		
		
		// TODO Auto-generated method stub

	}

}
