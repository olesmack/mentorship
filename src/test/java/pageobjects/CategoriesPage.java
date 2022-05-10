package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CategoriesPage extends BasePage {

    private By headphonesAndAccessories = By.cssSelector("[title='Навушники та аксесуари']");

    public CategoriesPage(WebDriver driver)
    {
        super(driver);

    }

    public void clickOnHeadphonesAndAccessories() {
        wait.until(ExpectedConditions.elementToBeClickable(headphonesAndAccessories)).click();
    }
}
