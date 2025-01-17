package search_context;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
//		driver.findElement(By.partialLinkText("Privacy")).click();

		WebElement textField = driver.findElement(By.id("email"));

		Actions act = new Actions(driver);
		act.sendKeys(textField, "Selenium!").perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_LEFT).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.SHIFT).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.keyUp(Keys.SHIFT).perform();
		Thread.sleep(1000);
		act.sendKeys("xvv").perform();

		Thread.sleep(5000);
		driver.close();
	}

}
