package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by saap.net on 01.02.2016.
 */
public class YandexPage {
    private final static String URL_SITE = "http://yandex.ru";
    protected WebDriver driver;

    public YandexPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public YandexLoginPage navigateToLoginPage() {
        driver.get(URL_SITE);
        return new YandexLoginPage(driver);
    }

}
