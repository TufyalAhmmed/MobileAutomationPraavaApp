package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MyAppoinments {
    private AndroidDriver driver;

    private By appoinmentDetails = By.xpath("//android.widget.CheckedTextView[@text='my appointments']");
    private By pastAppoinment = By.xpath("//android.widget.TextView[@text='past appointments + invoices']");


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
