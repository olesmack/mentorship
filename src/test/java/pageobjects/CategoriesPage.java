package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoriesPage extends BasePage {

    private By headphonesAndAccessories = By.cssSelector("[title='Навушники та аксесуари']");

    private WebDriver driver;
    public CategoriesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnHeadphonesAndAccessories() {
        driver.findElement(headphonesAndAccessories).click();
    }
}
