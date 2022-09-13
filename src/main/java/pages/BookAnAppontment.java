package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class BookAnAppontment {
    private AndroidDriver driver;

    private By bookAppointmentLink = By.id("com.praava.patientportal:id/Buttonbookappointment");

    public  BookAnAppontment (AndroidDriver driver) {
        this.driver = driver;
    }
    public void setBookAppointmentLink(){
        driver.findElement(bookAppointmentLink).click();
    }
}
