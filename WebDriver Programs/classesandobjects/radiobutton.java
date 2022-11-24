package classesandobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/radio-button");
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label"));
		WebElement radio=d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]"));
		List<WebElement> radio1=radio.findElements(By.tagName("input"));
		System.out.println(radio1.size());
		String s=d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p")).getText();
		System.out.println(s);
		d.close();
		
	}

}
