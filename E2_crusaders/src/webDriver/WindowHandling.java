package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		String parentID = driver.getWindowHandle();
		System.out.println("Facebook session id : " + parentID);

		driver.findElement(By.linkText("Meta Pay")).click();

		Set<String> IDs = driver.getWindowHandles();
		for (String id : IDs) {
			System.out.println(id);
		}

		driver.close();
	}

}
