package search_context;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.id("email")).sendKeys("admin");
//		driver.findElement(By.id("pass")).sendKeys("admin@123");
//		
//		driver.findElement(By.name("login")).click();
		
//		driver.findElement(By.linkText("Games")).click();
		driver.findElement(By.partialLinkText("Privacy")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
