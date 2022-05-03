package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.*;

public class CardTests {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testCardTests() {

        HomePage homePage = new HomePage(driver);
        CategoriesPage categoriesPage = new CategoriesPage(driver);
        HeadphonesAndAccessoriesPage headphonesAndAccessoriesPage = new HeadphonesAndAccessoriesPage(driver);
        ProductPage productPage = new ProductPage(driver);

        homePage.openHomePage();
        homePage.clickOnComputersAndLaptops();
        categoriesPage.clickOnHeadphonesAndAccessories();
        headphonesAndAccessoriesPage.clickOnFilter();
        headphonesAndAccessoriesPage.clickOnProduct();
        productPage.addToCart();
//        verifyProduct();
    }

    public void verifyProduct() {
        CartPage cartPage = new CartPage(driver);
        HeadphonesAndAccessoriesPage headphonesAndAccessoriesPage = new HeadphonesAndAccessoriesPage(driver);
        driver.findElement(cartPage.cartHeader).click();
        String name2 = driver.findElement(cartPage.productInCart).getText();
        if (headphonesAndAccessoriesPage.clickOnProduct().equals(name2)) {
            System.out.println(headphonesAndAccessoriesPage.clickOnProduct());
        } else {
            System.out.println("Wrong product in the cart");
        }
    }

    @AfterClass
    public void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }
}
