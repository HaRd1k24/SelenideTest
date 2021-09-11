import io.cucumber.java.en.Then;
import pages.BasicPageDef1;

public class MyStepdefs {
    BasicPageDef1 basicPageDef1 = new BasicPageDef1();
    @Then("click {string} click")
    public void clickClick(String arg0) {
        basicPageDef1.click();
    }
}
