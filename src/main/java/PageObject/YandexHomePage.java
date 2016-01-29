package PageObject;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YandexHomePage {
    private WebDriver driver;

    public YandexHomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By registrationName = By.className("header-user-name");
//    private By logOutButton = By.xpath(".//*[@id='user-dropdown-popup']/div/div/div[9]/a");
    private By logOutButton = By.xpath("//a[contains(@href, 'embeddedauth&action=logout')]");

    public String getRegistrationName() {
        return driver.findElement(registrationName).getText();
    }

    public void logOutEmail() {
        driver.findElement(registrationName).click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(logOutButton));
        driver.findElement(logOutButton).click();
    }

}
