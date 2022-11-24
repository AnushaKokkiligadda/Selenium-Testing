package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		d.findElement(By.name("userName")).sendKeys("Yashu");
		d.findElement(By.xpath("//input[@name='userName']")).sendKeys("Yamini");
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("yamini@2002");
		
		

	}

}
