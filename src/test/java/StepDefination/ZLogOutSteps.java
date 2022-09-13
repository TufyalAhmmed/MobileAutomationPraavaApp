package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BookAnAppontment;
import pages.ZLogOut;
import utils.basetests;

import java.net.MalformedURLException;

public class ZLogOutSteps {
    public AndroidDriver driver;
    pages.ZLogOut zLogOut;
    utils.basetests base;

    public ZLogOutSteps(basetests base) throws MalformedURLException {
        this.driver = base.setDriver();
        zLogOut = new ZLogOut(driver);
    }
    @When("Scroll till end")
    public void scroll_till_end() throws InterruptedException {
        Thread.sleep(4000);
        zLogOut.setScrollLink(2);
        Thread.sleep(2000);
    }
    @Then("Tap on LogOut Tab")
    public void tap_on_log_out_tab() throws InterruptedException {
        Thread.sleep(3000);
        zLogOut.setLogOutLink();
        Thread.sleep(4000);
    }

}
