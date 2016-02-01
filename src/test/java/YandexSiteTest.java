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
        for (int i = 0; i < 3; i++) {
            YandexHomePage yandexHomePage = yandexLoginPage.loginEmail("saa.tester", "SaaP9875959");
//            assertTrue(yandexHomePage.getRegistrationName().contains("saa.tester@yandex"), "Login FAIL!!!");
            yandexLoginPage = yandexHomePage.logOutEmail();
        }
    }

    @Test
    public void changeLanguageInYandexEmail() throws InterruptedException {
        YandexPage yandexPage = new YandexPage(driver);
        YandexLoginPage yandexLoginPage = yandexPage.navigateToLoginPage();
        YandexHomePage yandexHomePage = yandexLoginPage.loginEmail("saa.tester", "SaaP9875959");
        Thread.sleep(5000);
        yandexHomePage.changeLanguage("en");
        Thread.sleep(5000);
        yandexHomePage.changeLanguage("ru");
        Thread.sleep(5000);
        yandexHomePage.changeLanguage("be");
        Thread.sleep(5000);
        yandexLoginPage = yandexHomePage.logOutEmail();
//        Assert.assertTrue(yandexLoginPage.isVisibility(), "Logout FAIL!!!");

    }
}
