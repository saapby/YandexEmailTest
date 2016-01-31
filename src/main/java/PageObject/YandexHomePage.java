package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Helpers.Waiting.waitElement;

public class YandexHomePage extends YandexPage{

    public YandexHomePage(WebDriver driver) {
        super(driver);
//        PageFactory.initElements(driver, YandexLoginPage.class);
    }

    @FindBy(css = ".header-user-name.js-header-user-name")
    public WebElement userEmail;

    @FindBy(xpath = ".//*[@id='nb-1']")
    public WebElement emailUserName;

    @FindBy (xpath = ".//a[contains(@href, 'mode=embeddedauth&action=logout')][contains(@class, 'b-mail-dropdown__item__content')]")
    public WebElement logOutButton;

    public YandexLoginPage logOutEmail() {
        WebElement element = waitElement(driver, emailUserName);
        element.click();
        element = waitElement(driver, logOutButton);
        element.click();
        return new YandexLoginPage(driver);
    }
}
