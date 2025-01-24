package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ArrowKeyExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// Navigate to Google
		driver.get("https://www.google.com");

		// Find the search bar element
		WebElement searchBar = driver.findElement(By.name("q"));

		// Enter a partial search query
		searchBar.sendKeys("seleni");
		Thread.sleep(2000);

		Actions act = new Actions(driver);

		act.keyDown(Keys.ARROW_DOWN).build().perform();
		act.keyUp(Keys.ARROW_DOWN).build().perform();

		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(5000);
		driver.quit();
	}
}