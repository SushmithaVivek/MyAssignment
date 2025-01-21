package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver ch=new ChromeDriver();
		ch.get("http://leaftaps.com/opentaps");
		ch.manage().window().maximize();
		ch.findElement(By.id("username")).sendKeys("demosalesmanager");
		ch.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		ch.findElement(By.className("decorativeSubmit")).click();
		ch.findElement(By.partialLinkText("CRM")).click();
		ch.findElement(By.linkText("Leads")).click();
		ch.findElement(By.linkText("Create Lead")).click();
		ch.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		ch.findElement(By.id("createLeadForm_firstName")).sendKeys("Sushmitha");
		ch.findElement(By.id("createLeadForm_lastName")).sendKeys("Gopikrishnan");
		ch.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Tead");
		ch.findElement(By.className("smallSubmit")).click();
		System.out.println(ch.getTitle());
		ch.close();
			
	}
}

