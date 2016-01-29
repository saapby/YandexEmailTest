import PageObject.YandexHomePage;
import PageObject.YandexLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class YandexSiteTest extends Assert {
    private WebDriver driver;
    private YandexLoginPage yandexLoginPage;
    private YandexHomePage yandexHomePage;
    private final static String URL_SITE = "http://yandex.ru";


    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(URL_SITE);
        yandexLoginPage = new YandexLoginPage(driver);
        yandexHomePage = new YandexHomePage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test (invocationCount = 150)
    public void loginYandexEmailTest() {
        yandexLoginPage.loginEmail("saa.tester", "SaaP9875959");
        assertTrue(yandexHomePage.getRegistrationName().contains("saa.tester@yandex"), "Login FAIL!!!");
        yandexHomePage.logOutEmail();
        assertTrue(yandexLoginPage.isVisibility(), "Logout FAIL!!!");
    }
}
