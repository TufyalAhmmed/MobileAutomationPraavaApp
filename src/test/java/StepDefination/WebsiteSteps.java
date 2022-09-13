package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import pages.FamilysAccount;
import pages.Website;
import utils.basetests;

import java.net.MalformedURLException;

public class WebsiteSteps {
    private AndroidDriver driver;
    pages.Website website;
    utils.basetests base;

    public WebsiteSteps(basetests base) throws MalformedURLException {

        this.driver = base.setDriver();
        website = new Website(driver);
    }
    @Then("Tap on Website Button")
    public void tap_on_website_button() throws InterruptedException {
        Thread.sleep(2000);
      website.setWebsiteLink();
    }
}
