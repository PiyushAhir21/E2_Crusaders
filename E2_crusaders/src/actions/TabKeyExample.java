package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabKeyExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // Navigate to a registration page (replace with actual URL)
        driver.get("https://www.facebook.com/");

        // Find the first field (e.g., username)
        WebElement firstField = driver.findElement(By.id("email"));

        // Enter username and tab to next field
        firstField.sendKeys("qsp_021");
        firstField.sendKeys(Keys.TAB);

        // ... continue tabbing through fields ...

        // Close the browser
        Thread.sleep(5000);
        driver.quit();
    }
}