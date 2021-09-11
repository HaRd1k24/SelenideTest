package steps;

import io.cucumber.java.en.Then;
import pages.BasicPageDef;

public class BasicPage {
    BasicPageDef basicPageDef = new BasicPageDef();
    @Then("Click {string} button")
    public void clickButton(String arg0) {
        basicPageDef.clickBUtton();

    }
}
