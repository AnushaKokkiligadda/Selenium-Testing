package constructors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class const1 {
        WebDriver d;
        const1() throws InterruptedException {
        	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        	d=new ChromeDriver();
        	d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        	d.manage().window().maximize();
        	Thread.sleep(3000);
        	d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        	d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("Admin@1234");
        	d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        }

        	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		const1 c=new const1();

	}

}
