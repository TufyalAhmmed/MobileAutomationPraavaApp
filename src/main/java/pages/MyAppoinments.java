package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MyAppoinments {
    private AndroidDriver driver;

    private By appoinmentDetails = By.xpath("(//android.support.v7.widget.LinearLayoutCompat)[1]");
    private By pastAppoinment = By.xpath("(//android.widget.TextView)[3]");


    public  MyAppoinments(AndroidDriver driver) {
        this.driver = driver;
    }
    public void setAppoinmentDetails(){
        driver.findElement(appoinmentDetails).click();
    }
    public void setPastAppoinment(){
        driver.findElement(pastAppoinment);
    }
}
