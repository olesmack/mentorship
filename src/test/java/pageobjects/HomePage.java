package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By computersAndLaptops = By.cssSelector("div.menu-wrapper.menu-wrapper_state_static ul:first-child li:first-child a");

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomePage() {
        driver.get("https://rozetka.com.ua/ua/");
    }

    public void clickOnComputersAndLaptops() {
        driver.findElement(computersAndLaptops).click();
    }
}
