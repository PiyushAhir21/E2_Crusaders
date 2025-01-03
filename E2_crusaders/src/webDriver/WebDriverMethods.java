package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");

		String url1 = driver.getCurrentUrl();
		System.out.println(url1);

		driver.findElement(By.xpath("//div[text()='Log in with Facebook']")).click();

		Thread.sleep(2000);
		String title = driver.getTitle();
//		System.out.println(title);

		String url2 = driver.getCurrentUrl();
		System.out.println(url2);

		String pageSource =  driver.getPageSource();
		System.out.println(pageSource);
	}

}
