package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AllMouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://www.facebook.com/");
//		driver.get("https://demoapp.skillrary.com/product.php");
//		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin/");
//		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.get("https://en.wikipedia.org/wiki/Virat_Kohli");

		Actions act = new Actions(driver);
//		WebElement loginBtn = driver.findElement(By.name("login"));
//		loginBtn.click();
//		act.click(loginBtn).perform();
		
//		Right click
//		act.contextClick(loginBtn).build().perform();
		
//		double click
//		WebElement addBtn = driver.findElement(By.id("add"));
//		act.doubleClick(addBtn).build().perform();
//		act.doubleClick(addBtn).build().perform();
		
//		click and hold - release		
//		driver.findElement(By.id("password")).sendKeys("qwerty");
//		
//		WebElement eye = driver.findElement(By.xpath("//label[@for='password']/following-sibling::div"));
//		act.clickAndHold(eye).perform();
//
//		Thread.sleep(3000);
//		act.release().build().perform();
		
//		drag and drop
//		click and hold and move and release
//		WebElement washington = driver.findElement(By.id("box3"));
//		WebElement US = driver.findElement(By.id("box103"));
		
//		act.clickAndHold(washington).build().perform();
//		act.moveToElement(US).build().perform();
//		act.release(washington).build().perform();
		
//		act.dragAndDrop(washington, US).build().perform();
		
//		scroll
//		act.scrollByAmount(0, 500).build().perform();
//		
//		WebElement link = driver.findElement(By.xpath("//a[text()='cover drive']"));
//		act.scrollToElement(link).build().perform();
//		
//		act.moveToElement(link).build().perform();
		
		driver.findElement(By.name("search")).sendKeys("hey");
		
		act.keyDown(Keys.ENTER).build().perform();
		act.keyUp(Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
//		driver.close();
	}
}
