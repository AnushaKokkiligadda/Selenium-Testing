package package1;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class usingswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String browser=sc.nextLine();
		switch(browser) {
		case "a":
			System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://www.google.com/account/about/");
			d.manage().window().maximize();
			break;
		case "b":
			FirefoxDriver f=new FirefoxDriver();
			f.get("https://www.google.com/");
			f.manage().window().maximize();
			break;
		default:
			System.out.println("invalid");
		}	
	}

}
