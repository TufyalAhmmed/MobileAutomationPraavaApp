package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MyLabReports {
    private AndroidDriver driver;

    private By appoinmentDetails = By.xpath("(//android.support.v7.widget.LinearLayoutCompat)[2]");

    public  MyLabReports(AndroidDriver driver) {
        this.driver = driver;
    }
        public void setAppoinmentDetails(){
        driver.findElement(appoinmentDetails).click();
        }

}
