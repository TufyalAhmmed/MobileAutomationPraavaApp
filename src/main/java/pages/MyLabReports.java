package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MyLabReports {
    private AndroidDriver driver;

    private By appoinmentDetails = By.id("\t\n" +
            "com.praava.patientportal:id/Buttonbookappointment");

    public  MyLabReports(AndroidDriver driver) {
        this.driver = driver;
    }
        public void setAppoinmentDetails(){
        driver.findElement(appoinmentDetails).click();
        }

}
