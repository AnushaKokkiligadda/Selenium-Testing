package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confimation {
	WebDriver d;
	public void open_browser() {
		
		System.setProperty("webddriver.chrpome.driver","C://chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://demoqa.com/alerts");
        d.manage().window().maximize();
		
	}
	public void title() {
		System.out.println(d.getTitle());
	}
	public void url() {
		System.out.println(d.getCurrentUrl());
	}
	public void conf() throws InterruptedException {
		d.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		String s=d.findElement(By.id("confirmResult")).getText();
		System.out.println(s);
		
		
	}
	public void close() {
		d.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		confimation c=new confimation();
		c.open_browser();
		c.title();
		c.url();
		c.conf();
		c.close();

	}

}
