package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPage {
    public void addToCart() {
        driver.findElement(By.cssSelector(".buy-button__label.ng-star-inserted")).click();
    }
}
