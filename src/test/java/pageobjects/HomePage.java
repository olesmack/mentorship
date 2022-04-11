package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    WebDriver driver = new ChromeDriver();

    public void openHomePage() {
        driver.get("https://rozetka.com.ua/ua/");
    }

    public void clickOnComputersAndLaptops() {
        driver.findElement(By.cssSelector("div.menu-wrapper.menu-wrapper_state_static ul:first-child li:first-child a")).click();
    }
}
