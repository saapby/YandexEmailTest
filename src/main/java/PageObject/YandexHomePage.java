package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
        waitElement(driver, emailUserName).click();
        waitElement(driver, logOutButton).click();
        return PageFactory.initElements(driver, YandexLoginPage.class);
    }
}
