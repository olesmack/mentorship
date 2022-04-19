package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public void basePage()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/omaku/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
    }

}
