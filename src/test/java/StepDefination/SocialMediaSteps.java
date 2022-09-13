package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import pages.FamilysAccount;
import pages.SocialMedia;
import utils.basetests;

import java.net.MalformedURLException;

public class SocialMediaSteps {
    private AndroidDriver driver;
    SocialMedia socialMedia;
    utils.basetests base;

    public SocialMediaSteps(basetests base) throws MalformedURLException {

        this.driver = base.setDriver();
        socialMedia = new SocialMedia(driver);
    }
    @Then("Tap on Social Media Button")
    public void tap_on_social_media_button() throws InterruptedException {
        Thread.sleep(5000);
        socialMedia.setSocialMediaLink();
        Thread.sleep(5000);
    }
}
