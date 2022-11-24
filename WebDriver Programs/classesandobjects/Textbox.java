package classesandobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@id='userName']")).sendKeys("Yasaswini");
		d.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("yasaswinilokku@gmail.com");
		d.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("VTA Hostel","kavali");
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id='permanentAddress']")).sendKeys("Gandhistreet","Srikalahasthi");
		WebElement a=d.findElement(By.xpath("//*[@id='submit']"));
		a.click();
		String s=d.findElement(By.xpath("//*[@id=\"output\"]/div")).getText();
		System.out.println(s);


	}

}
