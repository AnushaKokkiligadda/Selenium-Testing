package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prompt {
	WebDriver d;
	public void open_browser() {
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
	public void prompt1() throws InterruptedException {
		d.findElement(By.id("promtButton")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("welcome");
		Thread.sleep(2000);
		alt.accept();
		String s=d.findElement(By.id("promptResult")).getText();
		System.out.println(s);
	}
	public void close() {
		d.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		prompt p=new prompt();
		p.open_browser();
		p.title();
		p.url();
		p.prompt1();
		p.close();
		
		

	}

}
