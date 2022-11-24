package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class8 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("web.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();
		WebElement drop=d.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]"));
		List<WebElement> drop1=drop.findElements(By.tagName("a"));
		System.out.println(drop1.size());
		for(int i=0;i<drop1.size();i++) {
			System.out.println(drop1.get(i).getText());
			drop1.get(i).click();
			Thread.sleep(1000);
			d.navigate().back();
			Thread.sleep(1000);
			d.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();
			drop=d.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]"));
			drop1=drop.findElements(By.tagName("a"));
			
		}

	}

}
