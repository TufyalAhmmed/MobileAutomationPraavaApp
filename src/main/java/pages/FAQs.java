package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class FAQs {
    private AndroidDriver driver;

    private By faqsLink = By.xpath("");



    public  FAQs(AndroidDriver driver) {
        this.driver = driver;
    }
    public void setFaqsLink(){
        driver.findElement(faqsLink).click();
    }
}
