package func;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class f1 {
	WebDriver d;
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
	}
	public String funct(String s1,String s2) throws InterruptedException {
		d.findElement(By.name("userName")).sendKeys(s1);
		d.findElement(By.name("password")).sendKeys(s2);
		Thread.sleep(2000);
		d.findElement(By.name("submit")).click();
		return null;
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		f1 f=new f1();
		f.open_browser();
		f.funct("Yasaswini","yamu@2002");
		

	}


}
