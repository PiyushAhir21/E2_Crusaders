package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.dream11.com/");

		WebElement frame = driver.findElement(By.id("send-sms-iframe"));
//		driver.switchTo().frame(frame);
//		driver.switchTo().frame(0);
		driver.switchTo().frame("send-sms-iframe");
		
		driver.findElement(By.id("regEmail")).sendKeys("789");
		}
}
