package ui_tests_selenide;

import base.BaseTest;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.*;
import static web_elements.Elements.*;

public class WaitsSelenideTests extends BaseTest {

    @Test
    @DisplayName("Ожидание появления элемента")
    @Description("Проверка появления элемента")
    public void waitElementToAppear() {
        addAndRemove.click();
        add.click();
        delete.shouldBe(visible);
    }

    @Test
    @DisplayName("Ожидание исчезновения элемента")
    @Description("Проверка исчезновения элемента")
    public void waitElementToDisappear() {
        addAndRemove.click();
        add.click();
        delete.shouldBe(visible).click();
        delete.should(disappear);
    }

    @Test
    @DisplayName("Ожидание определенного текста")
    @Description("Проверка появления определенного текста")
    public void waitSpecificText() {
        keyPresses.click();
        inputKeyPresses.setValue("a");
        resultKeyPresses.shouldHave(text("You entered: A"));
    }

    @Test
    @DisplayName("Ожидание определенного значения(1)")
    @Description("Проверка появления определенного значения")
    public void waitSpecificValue1() {
        inputs.click();
        inputsNumber.shouldBe(interactable).setValue("1").sendKeys(Keys.UP);
        inputsNumber.shouldHave(value("2"));
    }

    @Test
    @DisplayName("Ожидание определенного значения(2)")
    @Description("Проверка появления определенного значения")
    public void waitSpecificValue2() {
        dropdown.click();
        selectOption.shouldBe(interactable).sendKeys(Keys.DOWN);
        selectOption.shouldHave(value("1"));
    }

    @Test
    @DisplayName("Ожидание атрибута(1)")
    @Description("Проверка появления атрибута")
    public void waitAttribute1() {
        checkboxes.click();
        checkbox1.shouldBe(interactable).click();
        checkbox1.shouldHave(attribute("checked", "true"));
    }

    @Test
    @DisplayName("Ожидание атрибута(2)")
    @Description("Проверка появления атрибута")
    public void waitAttribute2() {
        formAuthentication.click();
        username.shouldBe(interactable).setValue("tomsmith");
        password.shouldBe(interactable).setValue("SuperSecretPassword!");
        login.shouldBe(interactable).click();
        successLogin.shouldHave(attribute("class", "flash success"));
    }

    @Test
    @DisplayName("Таймауты")
    @Description("Проверка работы установленного таймаута; проверка появления определенного текста")
    public void timeouts() {
        dynamicLoading.click();
        example1.shouldBe(interactable).click();
        start.shouldBe(interactable).click();
        Configuration.timeout = 7000;
        helloWorld.shouldHave(text("Hello World!"));
    }

    @Test
    @DisplayName("Ожидание со слипом(1)")
    @Description("Проверка ожидания с методом sleep; проверка появления определенного текста")
    public void sleep1() {
        dynamicLoading.click();
        example1.shouldBe(interactable).click();
        start.click();
        Selenide.sleep(7000);
        helloWorld.shouldHave(text("Hello World!"));
    }

    @Test
    @DisplayName("Ожидание со слипом(2)")
    @Description("Проверка ожидания с методом sleep")
    public void sleep2() {
        alerts.click();
        clickConfirm.click();
        Selenide.sleep(2000);
        Selenide.confirm();
    }
}