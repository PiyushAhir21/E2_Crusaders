package drop_down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		Select selDay = new Select(day);
		System.out.println(selDay.isMultiple());
		
//		List<WebElement> dayOptions = selDay.getOptions();
//		for (WebElement d : dayOptions) {
//			System.out.println(d.getText());
//		}
		
//		selDay.selectByIndex(0);
		
//		Select selMon = new Select(month);
//		selMon.selectByValue("2");
//		
//		Select selYea = new Select(year);
//		selYea.selectByVisibleText("1991");
//		
		Thread.sleep(3000);
		driver.close();
	}

}
