package synchronization;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/19");

		Thread.sleep(10000);
		driver.findElement(By.id("Check Delivery")).sendKeys("201301");

//		Implicitly wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		driver.findElement(By.id("Check")).click();
		
		driver.close();
	}
}
