package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CategoriesPage {
    public void clickOnHeadphonesAndAccessories() {
        driver.findElement(By.cssSelector("[title='Навушники та аксесуари']:last-child")).click();
    }
}
