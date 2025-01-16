package drop_down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

		driver.switchTo().frame("iframeResult");

		WebElement cars = driver.findElement(By.name("cars"));

		Select selCar = new Select(cars);

		System.out.println(selCar.isMultiple());
		selCar.selectByIndex(0);
		selCar.selectByIndex(1);
		selCar.selectByIndex(3);

		List<WebElement> all = selCar.getAllSelectedOptions();
		for (WebElement opt : all) {
			System.out.println(opt.getText());
		}
		
		Thread.sleep(3000);
		driver.close();
	}
}
