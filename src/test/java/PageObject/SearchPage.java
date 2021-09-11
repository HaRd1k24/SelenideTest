package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {

    public void visibleConvert(String str){
        $x("//li[@data-fast-name=\"units_converter\"]").shouldBe(Condition.text("Конвертер валют"));
    }

    public void clickUsd(){
        SelenideElement selenideElement = $x("//input[@value=\"1\"]");
        selenideElement.clear();
        selenideElement.setValue("100");
    }

}
