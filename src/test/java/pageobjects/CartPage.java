package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;

    public CartPage(WebDriver driver) {
    this.driver = driver;
    }

    public void verifyProduct() {
        HeadphonesAndAccessoriesPage headphonesAndAccessoriesPage = new HeadphonesAndAccessoriesPage(driver);
        driver.findElement(By.cssSelector(".header-actions__item.header-actions__item--cart")).click();
        String name2 = driver.findElement(By.cssSelector(".cart-product__main a")).getText();
        if (headphonesAndAccessoriesPage.clickOnProduct().equals(name2)) {
            System.out.println(headphonesAndAccessoriesPage.clickOnProduct());
        } else {
            System.out.println("Wrong product in the cart");
        }
    }
}
