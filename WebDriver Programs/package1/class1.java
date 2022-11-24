package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.navigate().to("https://www.google.com/");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		Thread.sleep(4000);
		d.close();

	}

}
