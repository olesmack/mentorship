package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadphonesAndAccessories {
    public void clickOnFilter() {
        driver.findElement(By.cssSelector("[class='checkbox-filter__link'][data-id='Rozetka']")).click();
    }
    public String clickOnProduct() {
        String name1 = driver.findElement(By.cssSelector("[title='Навушники Defunc True Music TWS Blue (D4274M)'] span")).getText();
        driver.findElement(By.cssSelector("[title='Навушники Defunc True Music TWS Blue (D4274M)'] span")).click();
        driver.findElement(By.cssSelector(".product__heading")).click();
        return name1;
    }
}
