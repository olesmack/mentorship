package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class ProductPage {

    WebDriver driver = new ChromeDriver();

    public void addToCart() {
        driver.findElement(By.cssSelector(".buy-button__label.ng-star-inserted")).click();
    }
}
