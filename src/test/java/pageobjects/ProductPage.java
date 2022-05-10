package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BasePage {

    private By cart = By.cssSelector(".buy-button__label.ng-star-inserted");

    public ProductPage(WebDriver driver)
    {
        super(driver);
    }

    public void addToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(cart)).click();
    }
}
