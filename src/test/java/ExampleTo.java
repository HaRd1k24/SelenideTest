import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class ExampleTo {
     static List<String> list = new LinkedList<>();
    @BeforeEach
    public void openPage() {
        open("https://randstuff.ru/number/");
    }

    @Test
    public void letsGO() {
        for (int i = 0; i < 3; i++) {
            String text = $x("//*[@id=\"number\"]").getText();
            $x("//*[@id='button']").click();
            sleep(1000);
            System.out.println(text);
            list.add(text);
        }

        System.out.println(list + "Сохраненки");
    }


}
