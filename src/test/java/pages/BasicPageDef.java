package pages;

import java.util.LinkedList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class BasicPageDef {
   static List<String> listStep = new LinkedList<>();

    public void clickBUtton(){
        for (int i = 0; i < 10; i++) {
            $x("//*[@id='button']").click();
            sleep(1000);
            String text = $x("//*[@id=\"number\"]").getText();

            listStep.add(text);
        }
        System.out.println(listStep);
    }

}
