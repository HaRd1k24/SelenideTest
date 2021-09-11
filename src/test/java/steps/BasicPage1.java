package steps;

import io.cucumber.java.en.Then;
import pages.BasicPageDef1;

public class BasicPage1 {

    BasicPageDef1 basicPageDef1 = new BasicPageDef1();


    @Then("click {string}")
    public void click(String arg0) {
        basicPageDef1.click();
    }

    @Then("open {string}")
    public void open(String arg0) {
       basicPageDef1.openX();
    }
}
