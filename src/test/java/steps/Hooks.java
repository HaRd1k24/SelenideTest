package steps;

import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    @Before
    public void setUp(){
        open("https://randstuff.ru/number/");
    }


}
