package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		d.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		d.findElement(By.id("nav-search-submit-button")).click();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.navigate().back();
		Thread.sleep(3000);
		d.navigate().forward();
		d.close();
		

	}

}