package pv.mareshchenkov.allure.steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.jsoup.select.Evaluator;
import pv.mareshchenkov.allure.pages.BasicPage;
import io.cucumber.java.en.Then;
import java.util.concurrent.TimeUnit;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    @Then("Click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);
    }

    @Then("Content with {string} visible")
    public void contentWithVisible(String arg0) {
        basicPage.contentIsVisible(arg0);
    }

    @Then("wait {int} second")
    public void waitSeconds(long amountOfSeconds) {
        Selenide.sleep(TimeUnit.MILLISECONDS.convert(amountOfSeconds, TimeUnit.SECONDS));
    }

    @Then("Green light is on")
    public void greenLightIsOn() {
        basicPage.greenOnIsAppear();
    }

    @Given("Red light is on")
    public void redLightIsOn() {
        basicPage.redOnIsAppear();
    }

    @And("Orange light is off")
    public void orangeLightIsOff() {
        basicPage.orangeOffIsAppear();
    }

    @And("Green light is off")
    public void greenLightIsOff() {
        basicPage.greenOffIsAppear();
    }

    @Then("Orange light is on")
    public void orangeLightIsOn() {
        basicPage.orangeOnIsAppear();
    }

    @Then("Red light is off")
    public void redLightIsOff() {
        basicPage.redOffIsAppear();
    }

}



//    @Then("wait for {int} seconds until element is presented")
//    public void waitForSecondsUntilElementIsPresented(int arg0) {
//    }

//    @And("user expecting (appearing|dissapearing) of elemnet \"([^\"]*)\" in \"([^\"]*)\" seconds$")
//    public void waitingForElement(string indicator, string element, string timeout) {
//        boolean isNotPresent = indicator.equals("dissapearing");
//        element = (String)Evaluator.getVariable(element);
//
//    }



