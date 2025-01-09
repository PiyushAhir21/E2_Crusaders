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
// 		Syntax : //tagName[@attributeName = 'attributeValue']
//		driver.findElement(By.xpath("//input[@id='small-searchterms]")).sendKeys("hey");

//		xpath by text()
// 		Syntax : //tagName[text() = 'textValue']
//		driver.findElement(By.xpath("//a[text()='Log in')]")).click();

//		xpath by contains()
//		driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();

//		xpath by multiple attributes
//		Logical operators => And & Or
//		driver.findElement(By.xpath("//input[@type='text' and @name='q']")).sendKeys("Hey");
	}

}
