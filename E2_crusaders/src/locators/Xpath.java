package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		
//		xpath by attribute
//		driver.findElement(By.xpath("//input[@id='small-searchterms]")).sendKeys("hey");

//		xpath by contains()
		driver.findElement(By.xpath("//input[contains(text(),'Log ')]")).sendKeys("hey");
		
//		xpath by multiple attributes
		
	}

}
