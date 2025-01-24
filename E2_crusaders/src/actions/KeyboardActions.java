package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://en.wikipedia.org/wiki/Virat_Kohli");

		WebElement searchField = driver.findElement(By.name("search"));

		Actions act = new Actions(driver);

		act.click(searchField).build().perform();

		act.sendKeys("anushka sharma").build().perform();

//		key press
		act.keyDown(Keys.ENTER).build().perform();
//		key release
		act.keyUp(Keys.ENTER).build().perform();
		
	}
}
