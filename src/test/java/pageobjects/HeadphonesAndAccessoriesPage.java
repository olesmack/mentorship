package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeadphonesAndAccessoriesPage extends BasePage {

    private By product = By.cssSelector("[title='Навушники Defunc True Music TWS Blue (D4274M)'] span");
    private By productHeading = By.cssSelector(".product__heading");

    public HeadphonesAndAccessoriesPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickOnFilter() {
        driver.findElement(By.cssSelector("[class='checkbox-filter__link'][data-id='Rozetka']")).click();
    }
    public String clickOnProduct() {
        String name1 = driver.findElement(product).getText();
        driver.findElement(product).click();
        driver.findElement(productHeading).click();
        return name1;
    }
}
