package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.*;

public class Rozetka {

    @Test
    public void testRozetka() {
        System.setProperty("webdriver.chrome.driver", "/Users/omaku/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        HomePage homePage = new HomePage(driver);
        CategoriesPage categoriesPage = new CategoriesPage(driver);
        HeadphonesAndAccessoriesPage headphonesAndAccessoriesPage = new HeadphonesAndAccessoriesPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        homePage.openHomePage();
        homePage.clickOnComputersAndLaptops();
        categoriesPage.clickOnHeadphonesAndAccessories();
        headphonesAndAccessoriesPage.clickOnFilter();
        headphonesAndAccessoriesPage.clickOnProduct();
        productPage.addToCart();

        public void verifyProduct () {
            driver.findElement(cartPage.cartHeader).click();
            String name2 = driver.findElement(cartPage.productInCart).getText();
            if (headphonesAndAccessoriesPage.clickOnProduct().equals(name2)) {
                System.out.println(headphonesAndAccessoriesPage.clickOnProduct());
            } else {
                System.out.println("Wrong product in the cart");
            }
        }
    }
}
