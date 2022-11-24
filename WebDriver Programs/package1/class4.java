package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.id("searchDropdownBox")).sendKeys("Deals");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops");
		d.findElement(By.id("nav-search-submit-button")).click();
		boolean a=d.findElement(By.id("nav-search-submit-button")).isSelected();
		System.out.println(a);
		boolean b=d.findElement(By.id("nav-search-submit-button")).isEnabled();
		System.out.println(b);
		boolean c=d.findElement(By.id("nav-search-submit-button")).isDisplayed();
		System.out.println(c);

	}

}
