//package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBtwWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://en-gb.facebook.com/");

		String parentId = driver.getWindowHandle();
		System.out.println(parentId);

		driver.findElement(By.linkText("Meta Pay")).click();

		Set<String> IDs = driver.getWindowHandles();
		IDs.remove(parentId);

		for (String id : IDs) {
			System.out.println("Child id : " + id);
			driver.switchTo().window(id);
			break;
		}

		driver.findElement(By.linkText("Check availability")).click();

		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Meta Pay")).click();

	}

}
