package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert1 {
	WebDriver d;
	public void alert_msg() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		
	}
	public void title() {
		System.out.println(d.getTitle());
	}
	public void url() {
		System.out.println(d.getCurrentUrl());
	}
	public void alert__msg1() throws InterruptedException {
		d.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(3000);
		alt.accept();
	}
	public void close() {
		d.close();
	}
	public static void main(String args[]) throws InterruptedException {
		alert1 a=new alert1();
		a.alert_msg();
		a.title();
		a.url();
		a.alert__msg1();
		a.close();
		
	}

}
