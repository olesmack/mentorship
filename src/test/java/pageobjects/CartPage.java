package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public By cartHeader = By.cssSelector(".header-actions__item.header-actions__item--cart");
    public By productInCart = By.cssSelector(".cart-product__main a");

    private WebDriver driver;

    public CartPage(WebDriver driver)
    {
        super(driver);
    }
}
