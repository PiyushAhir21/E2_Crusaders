package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
				
		driver.findElement(By.linkText("Meta Pay")).click();
		
		Thread.sleep(5000);
		
//		driver.close();
		driver.quit();
	}

}
