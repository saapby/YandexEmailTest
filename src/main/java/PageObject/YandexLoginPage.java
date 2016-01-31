package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Helpers.Waiting.waitElement;

public class YandexLoginPage extends YandexPage {

    public YandexLoginPage(WebDriver driver) {
        super(driver);
//        PageFactory.initElements(driver, YandexHomePage.class);
    }

    @FindBy(css = ".input__control[name='login']")
    public WebElement userNameField;

    @FindBy (css = ".input__control[name='passwd']")
    public WebElement passwordField;

    @FindBy (xpath = ".//*[contains(@type, 'submit')][contains(@class, 'domik2__auth-button')]")
    public WebElement loginButton;

    private void typeUserName(String user) {
        userNameField.sendKeys(user);
    }

    private void typePassword(String passwd) {
        passwordField.sendKeys(passwd);
    }

    private void clickLoginButtonEnterEmail() {
        WebElement element = waitElement(driver, loginButton);
        element.click();
    }

    public YandexHomePage loginEmail (String user, String passwd) {
        typeUserName(user);
        typePassword(passwd);
        clickLoginButtonEnterEmail();
        return new YandexHomePage(driver);
    }
}
