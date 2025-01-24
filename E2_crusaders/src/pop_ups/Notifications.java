package pop_ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifications {

	public static void main(String[] args) throws AWTException, InterruptedException {
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--incognito");
//		opt.addArguments("--disable-notifications");
//		
//		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.easemytrip.com/");

		Robot robot = new Robot();

		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);

	}

}
