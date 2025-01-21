package javascript_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_element {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://www.oracle.com/java/technologies/javase-jdk23-doc-downloads.html");
		driver.findElement(By.linkText("jdk-23.0.1_doc-all.zip")).click();
		WebElement downloadButton = driver.findElement(By.linkText("Download jdk-23.0.1_doc-all.zip"));

//		downloadButton.click(); // We can't perform this because element is disabled
		
		js.executeScript("arguments[0].click()", downloadButton);

	}
}
