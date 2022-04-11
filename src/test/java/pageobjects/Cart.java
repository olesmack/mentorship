package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart extends HeadphonesAndAccessories {
    WebDriver driver = new ChromeDriver();
    public void verifyProduct() {
        driver.findElement(By.cssSelector(".header-actions__item.header-actions__item--cart")).click();
        String name2 = driver.findElement(By.cssSelector(".cart-product__main a")).getText();
        if (clickOnProduct().equals(name2)) {
            System.out.println(clickOnProduct());
        } else {
            System.out.println("Wrong product in the cart");
        }
    }
}
