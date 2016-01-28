import PageObject.YandexHomePage;
import PageObject.YandexLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class YandexSiteTest extends Assert {
    private WebDriver driver;
    private YandexLoginPage yandexLoginPage;
    private YandexHomePage yandexHomePage;
    private final static String URL_SITE = "http://yandex.ru";


    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.get(URL_SITE);
        yandexLoginPage = new YandexLoginPage(driver);
        yandexHomePage = new YandexHomePage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test (threadPoolSize = 0, invocationCount = 10,  timeOut = 10000)
    public void loginYandexEmailTest() throws InterruptedException {
        yandexLoginPage.loginEmail("saa.tester", "SaaP9875959");
        assertTrue(yandexHomePage.getRegistrationName().contains("saa.tester@yandex"), "Login FAIL!!!");
        yandexHomePage.logOutEmail();
        assertTrue(yandexLoginPage.isVisibility(), "Logout FAIL!!!");
    }
}
