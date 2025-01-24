package pop_ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.oracle.com/java/technologies/javase-jdk23-doc-downloads.html");
		
		Thread.sleep(1000);
		WebElement input = driver.findElement(By.id("resumeUpload"));
		input.sendKeys("C:\\Users\\User\\Desktop\\anish resume WORD.docx");
	}

}
