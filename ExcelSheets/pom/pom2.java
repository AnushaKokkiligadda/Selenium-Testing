package pom;

import org.openqa.selenium.chrome.ChromeDriver;

public class pom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/register.php");
		d.manage().window().maximize();
		pomclass2 pc2=new pomclass2(d);
		pc2.fname();
		pc2.lname();
		pc2.mob();
		pc2.email();
		pc2.count();

	}

}
