package Helpers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class SetUpAndDownDriver {

    protected WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = Browsers.FIREFOX.create();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
