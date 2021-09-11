import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class Example2 {
    @Test
    public void setUp(List<String> list){
        for(String s : list) {
            open("https://www.google.com/");
            SelenideElement selenideElement = $x("//*[@name='q']");
            selenideElement.clear();
            selenideElement.setValue(s);
        }
    }
}
