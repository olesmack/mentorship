package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    private By computersAndLaptops = By.cssSelector("div.menu-wrapper.menu-wrapper_state_static ul:first-child li:first-child a");

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    public void openHomePage() {
        driver.get("https://rozetka.com.ua/ua/");
    }

    public void clickOnComputersAndLaptops() {
        wait.until(ExpectedConditions.elementToBeClickable(computersAndLaptops)).click();
    }
}
