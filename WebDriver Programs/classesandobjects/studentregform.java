package classesandobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class studentregform {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/automation-practice-form");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Yasaswini");
		d.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Lokku");
		d.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("yasaswinilokku@gmail.com");
		d.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		d.findElement(By.xpath("//input[@id='userNumber']")).sendKeys(("9121031440"));
		d.switchTo().frame(0);
		d.findElement(By.id("dateOfBirthInput")).click();
		d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[4]")).click();
		d.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("CSE");
		d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
		d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
		d.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\YASHASWINI\\Downloads");
		d.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("VITS HSTL", "KAVALI");
		d.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]")).sendKeys("Haryana");
		d.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]")).sendKeys("Delhi");
		Thread.sleep(3000);
		d.findElement(By.id("submit")).click();
	}

}
//*[@id="dateOfBirthInput"]
//*[@id="dateOfBirth"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]