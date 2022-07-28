package pv.mareshchenkov.allure.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import java.time.Duration;
import java.time.temporal.TemporalUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BasicPage {

    private final SelenideElement redOn = $x(
            "//div[contains(@class,'Home_red__H_jTz')]");
    private final SelenideElement orangeOn = $x(
            "//div[contains(@class,'Home_orange__CeNmC')]");
    private final SelenideElement greenOn = $x(
            "//div[contains(@class,'Home_green__g8l_e')]");

    private final SelenideElement orangeOff = $x(
            "//div[contains(@class,'Home_orange__CeNmC Home_off__KxUi3')]");
    private final SelenideElement greenOff = $x(
            "//div[contains(@class,'Home_green__g8l_e Home_off__KxUi3')]");
    private final SelenideElement redOff = $x(
            "//div[contains(@class,'Home_red__H_jTz Home_off__KxUi3')]");


    public void clickButton(String text) {
        $(By.xpath("//button[text()='" + text + "']")).click();
    }

    public void contentIsVisible(String text) {
        $(By.xpath("//*[text()='" + text + "']")).shouldBe(Condition.visible);
    }

    public void redOnIsAppear() {
        redOn.isDisplayed();
    }

    public void greenOnIsAppear() {
        greenOn.isDisplayed();
    }

    public void orangeOnIsAppear() {
        orangeOn.isDisplayed();
    }

    public void orangeOffIsAppear() {
        orangeOff.isDisplayed();
    }

    public void greenOffIsAppear() {
        greenOff.isDisplayed();
    }

    public void redOffIsAppear() {
        redOff.isDisplayed();
    }


}
