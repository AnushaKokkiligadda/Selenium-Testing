package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pomclass2 {
	WebDriver d;
	By first=By.name("firstName");
	By last=By.name("lastName");
	By phone=By.name("phone");
	By mail=By.name("userName");
	By coun=By.name("country");
    pomclass2(WebDriver d){
    	this.d=d;
    }
    public void fname() {
    	d.findElement(first).sendKeys("yashu");
    }
    public void lname() {
    	d.findElement(last).sendKeys("Yasaswini");
    }
    public void mob() {
    	d.findElement(phone).sendKeys("9121031440");
    }
    public void email() {
    	d.findElement(mail).sendKeys("yasaswinilokku@gmail.com");
    }
    public void count() {
    	d.findElement(coun).sendKeys("India");
    }

}
