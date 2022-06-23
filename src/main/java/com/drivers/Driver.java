package com.drivers;

import com.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Juan Felipe Silva
 *
 * Driver class, sets different browsers
 */
public class Driver {

    private WebDriver driver;

    /**
     * @author Juan Felipe Silva
     *
     * Constructor Driver, set the driver chosen.
     *
     * @param browser : string Browser to set
     */

    public Driver(String browser){
        switch (browser){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver",Utils.GECKO_DRIVER_LOCATION);
                driver = new FirefoxDriver();
                break;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
