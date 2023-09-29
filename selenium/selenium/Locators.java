package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%25253ASign+up");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("wpName2")).sendKeys("arpita");
		Thread.sleep(2000);
		driver.findElement(By.id("wpPassword2")).sendKeys("arpitajoshi");
		Thread.sleep(2000);
		driver.findElement(By.id("wpRetype")).sendKeys("arpitajoshi");
		Thread.sleep(2000);
		driver.findElement(By.id("wpEmail")).sendKeys("arpitajoshi@gmail.com");
		Thread.sleep(4000);
		boolean button = driver.findElement(By.id("wpCreateaccount")).isEnabled();
		System.out.println("the button is : " +button);
		driver.findElement(By.id("wpCreateaccount")).click();
		
	}

}
