package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class FAQs {
    private AndroidDriver driver;

    private By faqsLink = By.xpath("(//android.support.v7.widget.LinearLayoutCompat)[7]");



    public  FAQs(AndroidDriver driver) {
        this.driver = driver;
    }
    public void setFaqsLink(){
        driver.findElement(faqsLink).click();
    }
}
