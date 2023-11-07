package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {
    private WebDriver driver;

    public MyDriver(String browser) {
        if ("firefox".equals(browser)){
            driver = new FirefoxDriver();
        } else {
            String path = System.getProperty("user.dir");
            String driverPath = path + "\\drivers\\chromedriver-win64_v118.0.5993.70.exe";
            System.setProperty("webdriver.chrome.driver", driverPath);
            driver = new ChromeDriver();
        }
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
