package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiting extends SetUpAndDownDriver {

    public static WebElement waitElement(WebDriver driver, WebElement element) {
        return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(element));
    }
}