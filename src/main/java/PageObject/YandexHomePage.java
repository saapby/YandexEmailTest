package PageObject;

import org.openqa.selenium.By;
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

    @FindBy (xpath = "//span/img[contains(@src, '//yastatic.net/mail/neo2') and contains(@class, 'b-mail-icon_lang')]")
    public WebElement language;

    //for assert language
    @FindBy (css = "b-mail-icon_lang-en")
    public WebElement langEN;

    @FindBy (css = "b-mail-icon_lang-ru")
    public WebElement langRU;

    @FindBy (css = "b-mail-icon_lang-be")
    public WebElement langBE;

    public YandexLoginPage logOutEmail() {
        waitElement(driver, emailUserName).click();
        waitElement(driver, logOutButton).click();
        return PageFactory.initElements(driver, YandexLoginPage.class);
    }

    public YandexHomePage changeLanguage (String str) {
//        waitElement(driver, language).click();
        language.click();
//        WebElement lang = driver.findElement(By.xpath(".//img[contains(@alt, '" + str + "')]"));
//        waitElement(lang, driver);
//        lang.click();
//        WebElement element = driver.findElement(By.xpath(".//img[contains(@alt, '" + str + "')]"));
//        waitElement(driver, driver.findElement(By.xpath(".//img[contains(@alt, '" + str + "')]"))).click();
        WebElement element = driver.findElement(By.xpath(".//img[contains(@alt, '" + str + "')]"));
        waitElement(driver, element).click();
        return this;
    }
}
