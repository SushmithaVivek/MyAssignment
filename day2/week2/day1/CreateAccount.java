package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver ch=new ChromeDriver();
		ch.get("http://leaftaps.com/opentaps");
		ch.manage().window().maximize();
		ch.findElement(By.id("username")).sendKeys("demosalesmanager");
		ch.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		ch.findElement(By.className("decorativeSubmit")).click();
		ch.findElement(By.partialLinkText("CRM")).click();
		ch.findElement(By.linkText("Accounts")).click();
		ch.findElement(By.linkText("Create Account")).click();
		ch.findElement(By.className("inputBox")).sendKeys("Sushmitha Snm");
		ch.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		ch.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		ch.findElement(By.id("numberEmployees")).sendKeys("20");
		ch.findElement(By.className("smallSubmit")).click();
		System.out.println(ch.getTitle());
		//ch.close();

	}

}
