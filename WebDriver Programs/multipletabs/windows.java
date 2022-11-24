package multipletabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/browser-windows");
		d.manage().window().maximize();
		String parent_id=d.getWindowHandle();
		System.out.println(parent_id);
		d.findElement(By.id("windowButton")).click();
		Set<String>child_id=d.getWindowHandles();
		System.out.println(child_id);
		for(String handle:child_id) {
			if(!handle.equalsIgnoreCase(parent_id)) {
				d.switchTo().window(handle);
				System.out.println(d.findElement(By.id("sampleHeading")).getText());
				d.close();
			}
		}
		

	}

}
