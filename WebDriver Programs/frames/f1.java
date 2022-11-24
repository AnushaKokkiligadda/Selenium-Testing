package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class f1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.dezlearn.com/iframe-example/");
		d.manage().window().maximize();
		d.switchTo().frame("iframe1");
		d.findElement(By.id("u_5_6")).click();
		Thread.sleep(2000);
		String s=d.findElement(By.id("processing")).getText();
		System.out.println(s);
		d.close();

	}

}
