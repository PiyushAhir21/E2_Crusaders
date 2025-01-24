package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3school {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.get("https://www.dream11.com/");
		
//		WebElement frameId = driver.findElement(By.id("iframeResult"));
		
		driver.switchTo().frame(0);
		
		WebElement submit = driver.findElement(By.id("regEmail"));
		submit.sendKeys("9876543210");
//		
//		Thread.sleep(2000);
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("runbtn")).click();
	}
}
