package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://www.flipkart.com/");
//
//		WebElement acc = driver.findElement(By.xpath("//span[text()='Login']"));
//		
		Actions act = new Actions(driver);
//		act.moveToElement(acc).build().perform();
//		act.click().build().perform();

//		act.contextClick(acc).build().perform();

//		driver.get("http://demoapp.skillrary.com/product.php");
//		
//		WebElement plus = driver.findElement(By.id("add"));
//		act.doubleClick(plus).build().perform();
////		new Actions(driver)
////			.moveToElement(acc)
////			.click()
////			.perform();
//
//		
//		Thread.sleep(1000);
//		act.doubleClick(plus).build().perform();
//		Thread.sleep(1000);
//		act.doubleClick(plus).build().perform();
//		Thread.sleep(1000);
//		act.doubleClick(plus).build().perform();

//		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin/");
//		
//		driver.findElement(By.id("password")).sendKeys("qwerty");
//		
//		WebElement eye = driver.findElement(By.xpath("//label[@for='password']/following-sibling::div"));
//		act.clickAndHold(eye).perform();
//		
//		Thread.sleep(5000);
//		act.release().build().perform();
//		
//		Thread.sleep(1000);

//		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//
//		WebElement oslo = driver.findElement(By.id("box1"));
//		WebElement madrid = driver.findElement(By.id("box7"));
//		
//		WebElement norway = driver.findElement(By.id("box101"));
//		WebElement spain = driver.findElement(By.id("box107"));
//
//		act.dragAndDrop(oslo, norway).build().perform();
//		act.dragAndDrop(madrid, spain).build().perform();
		
		driver.get("https://www.facebook.com/");
		
		act.scrollByAmount(0, 500).build().perform();
		
		Thread.sleep(5000);

		driver.close();
	}

}
