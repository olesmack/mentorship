package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeadphonesAndAccessoriesPage extends BasePage {

    private By product = By.cssSelector("[title='Навушники Defunc True Music TWS Blue (D4274M)'] span");
    private By productHeading = By.cssSelector(".product__heading");
    private By filterRozetkaSeller = By.cssSelector("[class='checkbox-filter__link'][data-id='Rozetka']");

    public HeadphonesAndAccessoriesPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickOnFilter() {
        wait.until(ExpectedConditions.elementToBeClickable(filterRozetkaSeller)).click();
    }
    public String clickOnProduct() {
        String name1 = driver.findElement(product).getText();
        wait.until(ExpectedConditions.elementToBeClickable(product)).click();
        wait.until(ExpectedConditions.elementToBeClickable(productHeading)).click();
        return name1;
    }
}
