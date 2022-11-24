package func;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginusingfuncoverloading {
	WebDriver d;
	public void login1() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
	}
	public void login1(String s1) {
		d.get(s1);
		d.manage().window().maximize();
	}
	public void login1(String uname,String password) throws InterruptedException {
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		d.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		d.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		d.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		loginusingfuncoverloading a=new loginusingfuncoverloading();
		a.login1();
		a.login1("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		a.login1("Yashu","12445");
	}

}
