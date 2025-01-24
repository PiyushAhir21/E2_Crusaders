package demo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class HandleNotificationWithRobot {
    public static void main(String[] args) throws AWTException, InterruptedException {

    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Ensure the browser is maximized
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the website
        driver.get("https://www.easemytrip.com/");

        // Use Robot to simulate ESC key to dismiss pop-ups
        Robot robot = new Robot();
        Thread.sleep(5000); // Allow some time for the notification pop-up to appear

        // Simulate pressing the ESC key to close the notification
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);

        // Perform further automation tasks
        System.out.println("Notification pop-up handled using Robot.");

        // Close the browser
        driver.quit();
    }
}
