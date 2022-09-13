package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Map {
    private AndroidDriver driver;

    private By mapLink = By.id("com.praava.patientportal:id/ButtonMap");


    public  Map(AndroidDriver driver) {
        this.driver = driver;
    }
    public void setMapLink(){
        driver.findElement(mapLink).click();
    }
}
