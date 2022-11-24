package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/radio-button");
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label"));
		WebElement a=d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]"));
		List<WebElement> b=d.findElements(By.tagName("input"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++) {
			System.out.println(b.get(i).getAttribute("checked")+" "+b.get(i).getAttribute("value"));
		}
        WebElement s=d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p"));
        System.out.println(s);
	}

}
