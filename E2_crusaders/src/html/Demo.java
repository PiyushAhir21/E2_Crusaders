package html;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/git/E2_crusaders/E2_crusaders/src/html/Surroundings.html");
		
		driver.findElement(null);
	}
}
