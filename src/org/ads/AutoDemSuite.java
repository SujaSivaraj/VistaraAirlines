package org.ads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDemSuite {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sivaraj\\eclipse-workspace\\ADS\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title -"+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl"+currentUrl);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Prior");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		lastName.sendKeys("Svelte");
		
		WebElement addRess = driver.findElement(By.xpath("//textarea[contains(@class,'ng-pristine')]"));
		addRess.sendKeys("302, SSPDL");
		
		WebElement eMail = driver.findElement(By.xpath("//input[contains(@class,'ng-valid-email')]"));
		eMail.sendKeys("west@gmail.com");
		
		WebElement phnNum = driver.findElement(By.xpath("//input[@type='tel']"));		
		phnNum.sendKeys("9187544");
		
		WebElement radioBtn = driver.findElement(By.xpath("//input[@value='FeMale']"));
		radioBtn.click();
		
		WebElement checkBox1 = driver.findElement(By.id("checkbox1"));
		checkBox1.click();
		
	}

}
