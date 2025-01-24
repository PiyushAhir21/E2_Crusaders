package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterKeyExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Find the search bar element
        WebElement searchBar = driver.findElement(By.name("q"));

        // Enter the search query
        searchBar.sendKeys("Selenium");

        // Press Enter to submit the search
        searchBar.sendKeys(Keys.ENTER);

        // Wait for search results to load (optional)
        // ...

        // Close the browser
        Thread.sleep(5000);
        driver.quit();
    }
}