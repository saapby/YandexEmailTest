package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YandexLoginPage {
    private By userName = By.cssSelector(".input__control[name='login']");
    private By password = By.cssSelector(".input__control[name='passwd']");
    private By button = By.cssSelector(".auth__button[role='button'][type='submit']");

    private WebDriver driver;

    public YandexLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private void typeUserName(String user) {
        driver.findElement(userName).sendKeys(user);
    }

    private void typePassword(String passwd) {
        driver.findElement(password).sendKeys(passwd);
    }

    private void clickButton() {
        driver.findElement(button).click();
    }

    public void loginEmail (String user, String passwd) {
        typeUserName(user);
        typePassword(passwd);
        clickButton();
    }

    public boolean isVisibility() {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(button));
        return driver.findElement(button).isDisplayed();
    }
}
