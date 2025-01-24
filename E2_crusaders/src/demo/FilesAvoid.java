package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilesAvoid {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=CjwKCAiAkc28BhB0EiwAM001TbTY6j0_cx4aPLp9S6IvbjL0-LKuVxuR3KtdYUd3FcYxzdu7ZbjxjxoCOp8QAvD_BwE&gclsrc=aw.ds");
		
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\User\\Desktop\\anish resume WORD.docx");
	}

}
