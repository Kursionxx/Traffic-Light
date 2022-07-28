package pv.mareshchenkov.allure.steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.Before;

public class BeforeSteps {

    @Before
    public void openUrl() {
        Selenide.open("https://traffic-light-nine.vercel.app/");
    }
}
