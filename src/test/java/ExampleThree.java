import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class ExampleThree {

    @BeforeEach
    public void setUp() {
        open("https://google.com");
    }

    @Test
    public void let() {
        SelenideElement selenideElement = $x("//*[@name='q']");
        selenideElement.clear();
        selenideElement.setValue(String.valueOf(ExampleTo.list)).pressEnter();
        back();

    }
}

