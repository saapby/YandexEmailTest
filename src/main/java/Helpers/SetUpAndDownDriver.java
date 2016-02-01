package Helpers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class SetUpAndDownDriver {

    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = Browsers.FIREFOX.create();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
