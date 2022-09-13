package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ZLogOut {
    private AndroidDriver driver;

    private By scrollLink = By.xpath("(//android.widget.FrameLayout)[8]");
    private By logOutLink = By.xpath("//android.widget.CheckedTextView[@text='logout']");

    public  ZLogOut (AndroidDriver driver) {
        this.driver = driver;
    }
    public void setScrollLink(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor) driver;
//        while (getNumberOfParagraphsPresent() < index) {
//            jsExecutor.executeScript(script);
//        }
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)", driver.findElement(scrollLink));
    }
    public void setLogOutLink(){
        driver.findElement(logOutLink).click();
    }
}
