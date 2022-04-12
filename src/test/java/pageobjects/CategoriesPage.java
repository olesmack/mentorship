package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CategoriesPage {

    private WebDriver driver;
    public CategoriesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnHeadphonesAndAccessories() {
        driver.findElement(By.cssSelector("[title='Навушники та аксесуари']")).click();
    }
}
