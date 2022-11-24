package pom;

import org.openqa.selenium.chrome.ChromeDriver;

public class pom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		pomclass pc=new pomclass(d);
		pc.uname();
		pc.pass();
		pc.signon();
		

	}

}
