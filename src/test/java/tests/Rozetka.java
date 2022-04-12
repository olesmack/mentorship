package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.*;

public class Rozetka {

    @Test
    public void testRozetka()
    {
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
        cartPage.verifyProduct();
    }
}
