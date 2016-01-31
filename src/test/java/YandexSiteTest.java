import Helpers.SetUpAndDownDriver;
import PageObject.YandexHomePage;
import PageObject.YandexLoginPage;
import PageObject.YandexPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class YandexSiteTest extends SetUpAndDownDriver{
        private YandexPage yandexPage = new YandexPage(driver);

    @Test //(invocationCount = 150)
    public void loginYandexEmailTest() {
        yandexPage.navigateToLoginPage();
        YandexLoginPage yandexLoginPage = PageFactory.initElements(driver, YandexLoginPage.class);
        YandexHomePage yandexHomePage = yandexLoginPage.loginEmail("saa.tester", "SaaP9875959");
        //assertTrue(yandexHomePage.getRegistrationName().contains("saa.tester@yandex"), "Login FAIL!!!");
        yandexHomePage.logOutEmail();
    }
}
