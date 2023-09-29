package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(1500);
		
		
		
		Alert a = (Alert) driver.switchTo().alert();

		String alertText= ((WebElement) a).getText();
		System.out.println(alertText);
		
		((org.openqa.selenium.Alert) a).accept();
		
		driver.findElement(By.id("login1")).sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("admin");

	}

}
