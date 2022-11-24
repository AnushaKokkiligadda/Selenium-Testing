package keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
	 static WebDriver d;
	 class1(WebDriver d){
		 this.d=d;
	 }
	public void Opening_browser() {
		System.setProperty("webdriver.chrome.driver","C://chroemdriver.exe");
		d=new ChromeDriver();
	}
	public void Navite() {
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
	}
	public void User_name() {
		d.findElement(By.name("userName")).sendKeys("yashu");
	}
	public void Password() {
		d.findElement(By.name("password")).sendKeys("yamu123");
	}
	public void Click() {
		d.findElement(By.name("submit")).click();
	}
	public void Close() {
		d.close();
	}

}
