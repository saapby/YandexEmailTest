package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public enum Browsers {
    CHROME {
        @Override
        public WebDriver create(){
            return new ChromeDriver();
        }
    },
    IE {
        @Override
        public WebDriver create(){
            return new InternetExplorerDriver();
        }
    },
    FIREFOX {
        @Override
        public WebDriver create() {
            return new FirefoxDriver();
        }
    };

    public WebDriver create(){
        return null;
    }
}
