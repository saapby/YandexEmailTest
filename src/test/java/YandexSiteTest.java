import Helpers.SetUpAndDownDriver;
import PageObject.YandexHomePage;
import PageObject.YandexLoginPage;
import PageObject.YandexPage;
import org.testng.annotations.Test;

public class YandexSiteTest extends SetUpAndDownDriver{

    @Test
    public void loginYandexEmailTest() throws InterruptedException {
        YandexPage yandexPage = new YandexPage(driver);
        YandexLoginPage yandexLoginPage = yandexPage.navigateToLoginPage();
        for (int i = 0; i < 20; i++) {
            YandexHomePage yandexHomePage = yandexLoginPage.loginEmail("saa.tester", "SaaP9875959");
//            assertTrue(yandexHomePage.getRegistrationName().contains("saa.tester@yandex"), "Login FAIL!!!");
            yandexLoginPage = yandexHomePage.logOutEmail();
        }
    }
}
