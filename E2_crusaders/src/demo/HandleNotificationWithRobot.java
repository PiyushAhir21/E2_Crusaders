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
        options.addArguments("--start-maximized");
        
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.easemytrip.com/");

        Robot robot = new Robot();
        Thread.sleep(5000); 
        
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);

        System.out.println("Notification pop-up handled using Robot.");

        driver.quit();
    }
}
