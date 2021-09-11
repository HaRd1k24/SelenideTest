package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static pages.BasicPageDef.listStep;

public class BasicPageDef1 {
    public void click(){
        open("https://google.com");
        for( String s : listStep) {
            SelenideElement selenideElement = $x("//*[@name=\"q\"]").setValue(s);
            selenideElement.clear();
            selenideElement.pressEnter();
            back();
        }

    }

    public void openX(){
        open("https://google.com");
    }
}
