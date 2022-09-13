package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MapDirection {
    private AndroidDriver driver;

    private By allowLink = By.id("com.android.packageinstaller:id/permission_allow_button");
    private By mapDirectionLink = By.xpath("(//android.view.View)[2]");



    public  MapDirection(AndroidDriver driver) {
        this.driver = driver;
    }
    public void setAllowLink(){
        driver.findElement(allowLink).click();
    }
    public void setMapDirectionLink(){
        driver.findElement(mapDirectionLink).click();
    }
}
