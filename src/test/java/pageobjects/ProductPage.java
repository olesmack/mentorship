package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private By cart = By.cssSelector(".buy-button__label.ng-star-inserted");

    private WebDriver driver;
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        driver.findElement(cart).click();
    }
}
