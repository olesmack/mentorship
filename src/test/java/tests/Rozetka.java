package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.*;

public class Rozetka {

    @Test
    public void testRozetka()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/omaku/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        HomePage homePage = new HomePage();
        CategoriesPage categoriesPage = new CategoriesPage();
        HeadphonesAndAccessories headphonesAndAccessories = new HeadphonesAndAccessories();
        ProductPage productPage = new ProductPage();
        Cart cart = new Cart();

        homePage.openHomePage();
        homePage.clickOnComputersAndLaptops();
        categoriesPage.clickOnHeadphonesAndAccessories();
        headphonesAndAccessories.clickOnFilter();
        headphonesAndAccessories.clickOnProduct();
        productPage.addToCart();
        cart.verifyProduct();

//        driver.get("https://rozetka.com.ua/ua/");
//        driver.findElement(By.cssSelector("div.menu-wrapper.menu-wrapper_state_static ul:first-child li:first-child a")).click();
//        driver.findElement(By.cssSelector("[title='Навушники та аксесуари']:last-child")).click();
//        driver.findElement(By.cssSelector("[class='checkbox-filter__link'][data-id='Rozetka']")).click();
//        String name1 = driver.findElement(By.cssSelector("[title='Навушники Defunc True Music TWS Blue (D4274M)'] span")).getText();
//        driver.findElement(By.cssSelector("[title='Навушники Defunc True Music TWS Blue (D4274M)'] span")).click();
//        driver.findElement(By.cssSelector(".product__heading")).click();
//        driver.findElement(By.cssSelector(".buy-button__label.ng-star-inserted")).click();
//        driver.findElement(By.cssSelector(".header-actions__item.header-actions__item--cart")).click();
//        String name2 = driver.findElement(By.cssSelector(".cart-product__main a")).getText();
//        if (name1.equals(name2)) {
//            System.out.println(name1);
//        } else {
//            System.out.println("Wrong product in the cart");
//        }
    }
}
