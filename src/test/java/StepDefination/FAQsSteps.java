package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import pages.FAQs;
import utils.basetests;

import java.net.MalformedURLException;

public class FAQsSteps {
    private AndroidDriver driver;
    FAQs faq;
    utils.basetests base;

    public FAQsSteps(basetests base) throws MalformedURLException {

        this.driver = base.setDriver();
        faq = new FAQs(driver);
    }

    @Then("Tap on FAQs")
    public void tap_on_fa_qs() throws InterruptedException {
        Thread.sleep(3000);
    faq.setFaqsLink();

    }
}
