package synchronization;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
//		First line of code
		WebDriver driver = new ChromeDriver();
//		Second line of code
		driver.manage().window().maximize();
//		Third line of code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		driver.get("https://www.jiocinema.com/");		
		
//		Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='AUS vs IND']")));
		ele.click();
		
		WebElement ele2 = wait.until(null);
		ele.clear();
	}
}