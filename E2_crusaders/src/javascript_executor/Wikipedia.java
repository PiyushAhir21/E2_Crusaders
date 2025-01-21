package javascript_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://en.wikipedia.org/wiki/MS_Dhoni");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.location='https://www.flipkart.com'");		
		
		js.executeScript("window.scrollBy(0,-1500)");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollTo(0,2000)");
//		Thread.sleep(1000);
		
		WebElement webelement = driver.findElement(By.id("searchInput"));
		WebElement webelement2 = driver.findElement(By.xpath("//button[text()='Search']")); 
//		js.executeScript("arguments[0].scrollIntoView(false)", webelement);
		js.executeScript("arguments[0].value=arguments[1]", webelement, "Hey");
		js.executeScript("arguments[0].click()", webelement2);
	}

}
