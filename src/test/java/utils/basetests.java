package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class basetests {

    public static AndroidDriver driver;


    public AndroidDriver setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "9");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("app", "D:\\MobileAutomationPravaApp\\apps\\Praava Health_v1.19_apkpure.com.apk");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
        return driver;
    }
    @Before
    public AndroidDriver setDriver() throws MalformedURLException {
        return driver;
    }

    public AndroidDriver getDriver() {
        return driver;
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}

