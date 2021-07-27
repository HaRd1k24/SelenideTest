import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class Example {

    @BeforeEach
    public void setUp(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        open("https://yandex.ru");
    }

    @Test
    @DisplayName("Проверка конвертации валют")
    void test() throws InterruptedException {
        $x("//input[@name=\"text\"]").setValue("Курс валют");
        $x("//button[@type=\"submit\"]").click();
        $x("//li[@data-fast-name=\"units_converter\"]").shouldBe(Condition.text("Конвертер валют"));
        SelenideElement selenideElement = $x("//input[@value=\"1\"]");
        selenideElement.clear();
        selenideElement.setValue("100");

        Thread.sleep(1000);
    }
}
