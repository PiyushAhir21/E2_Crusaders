package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBySurrondings {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("C:\\Users\\User\\git\\E2_crusaders\\E2_crusaders\\src\\html\\Surroundings.html");
		
		WebElement male = driver.findElement(By.xpath("//label[text()='Male']/../../span/input"));
//		driver.findElement(By.xpath("//label[text()='Male']/../..//input"));	;
	}

}
