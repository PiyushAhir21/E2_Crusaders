package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// Navigate to a page with two text fields (replace with actual URL)
		driver.get("https://www.facebook.com/");

		// Find the source and destination text fields
		WebElement sourceField = driver.findElement(By.id("email"));
		WebElement destinationField = driver.findElement(By.id("pass"));

		// Enter text in the source field
		sourceField.sendKeys("Text to be copied.");

		// Select all text in the source field
		sourceField.sendKeys(Keys.CONTROL, "a");

		// Copy the selected text
		sourceField.sendKeys(Keys.CONTROL, "c");

		// Paste the copied text into the destination field
		destinationField.sendKeys(Keys.CONTROL, "v");

		// Close the browser
		Thread.sleep(5000);
		driver.quit();
	}
}