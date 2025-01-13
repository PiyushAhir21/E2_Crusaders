package locators;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);
		// Syntax : tagname[attribute_name = attribute_value]
		WebElement searchField = driver.findElement(By.cssSelector("input[type='text']"));
		searchField.sendKeys("computers");	
	}
}
